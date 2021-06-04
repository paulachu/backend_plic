package org.backend.Services.Component.Mesh;

import org.backend.Elements.Components.Collider.MeshCollider;
import org.backend.Elements.Components.Mesh.MeshFilter;
import org.backend.Repositories.Component.Mesh.MeshFilterRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.LockModeType;
import java.util.List;

@ApplicationScoped
public class MeshFilterService {
    @Inject
    MeshFilterRepository meshFilterRepository;

    public List<MeshFilter> getMeshFilters()
    {
        return meshFilterRepository.listAll();
    }

    public void addMeshFilter(MeshFilter meshFilter)
    {
        meshFilterRepository.persist(meshFilter);
    }

    public boolean deleteById(Long id)
    {
        return meshFilterRepository.deleteById(id);
    }

    public boolean putById(Long id, MeshFilter meshFilter) {
        MeshFilter row = meshFilterRepository.findById(id, LockModeType.PESSIMISTIC_WRITE);
        if (row != null)
        {
            row.setMesh(meshFilter.getMesh());
            row.setGameObject(meshFilter.getGameObject());
            return true;
        }
        return false;
    }
}
