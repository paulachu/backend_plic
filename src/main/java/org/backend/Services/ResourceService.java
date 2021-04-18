package org.backend.Services;

import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import org.backend.ConfigurationProperties;
import org.backend.Elements.Enum.ResourceType;
import org.backend.Elements.Resource;
import org.backend.FormData.FormData;
import org.backend.Repositories.ResourceRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.io.FileInputStream;
import java.util.List;
import java.util.Locale;

@ApplicationScoped
public class ResourceService
{
    @Inject
    ResourceRepository resourceRepository;
    @Inject
    ConfigurationProperties props;
    public List<Resource> getResources()
    {
        return resourceRepository.listAll();
    }
    public Resource getById(Long id)
    {
        return resourceRepository.findById(id);
    }
    public boolean addResourceMinio(FormData resource)
    {
        try {
            var ent = new Resource(resource.name, ResourceType.valueOf(resource.type));
            resourceRepository.persist(ent);
            MinioClient minioClient =
                    MinioClient.builder()
                            .endpoint(props.endpoint)
                            .credentials(props.username, props.password)
                            .build();
            minioClient.putObject(
                    PutObjectArgs.builder().bucket(resource.type).object(resource.name)
                            .stream(new FileInputStream(resource.file), resource.file.length(), -1)
                            .build());

        }
        catch (Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteResource(Long id)
    {
        // suppression
        return resourceRepository.deleteById(id);
    }
}
