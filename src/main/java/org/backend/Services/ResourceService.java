package org.backend.Services;

import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import org.backend.ConfigurationProperties;
import org.backend.Elements.Enum.ResourceType;
import org.backend.Elements.GameObject;
import org.backend.Elements.Resource;
import org.backend.FormData.FormData;
import org.backend.Repositories.ResourceRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.LockModeType;
import java.io.FileInputStream;
import java.util.List;
import java.util.Locale;

@ApplicationScoped
public class ResourceService
{
    @Inject
    ResourceRepository resourceRepository;
    private String minio_url = "http://127.0.0.1:9000";
    private String minio_user = "minioadmin";
    private String minio_pwd = "minioadmin";
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
                            .endpoint(minio_url)
                            .credentials(minio_user, minio_pwd)
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
        return resourceRepository.deleteById(id);
    }

    public boolean putById(Long id, FormData resource) {
        Resource row = resourceRepository.findById(id, LockModeType.PESSIMISTIC_WRITE);
        if (row != null) {
            row.setName(resource.name);
            row.setType(ResourceType.valueOf(resource.type));
            try {
                MinioClient minioClient =
                        MinioClient.builder()
                                .endpoint(minio_url)
                                .credentials(minio_user, minio_pwd)
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
        return false;
    }
}
