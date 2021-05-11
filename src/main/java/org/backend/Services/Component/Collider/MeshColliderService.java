package org.backend.Services.Component.Collider;

import org.backend.Elements.Components.Collider.CharacterController;
import org.backend.Elements.Components.Collider.MeshCollider;
import org.backend.Repositories.Component.Collider.CharacterControllerRepository;
import org.backend.Repositories.Component.Collider.MeshColliderRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.LockModeType;
import java.util.List;

@ApplicationScoped
public class MeshColliderService {
    @Inject
    MeshColliderRepository meshColliderRepository;

    public List<MeshCollider> getMeshColliders()
    {
        return meshColliderRepository.listAll();
    }

    public void addMeshCollider(MeshCollider meshCollider)
    {
        meshColliderRepository.persist(meshCollider);
    }

    public boolean deleteById(Long id)
    {
        return meshColliderRepository.deleteById(id);
    }

    public boolean putById(Long id, MeshCollider meshCollider) {
        MeshCollider row = meshColliderRepository.findById(id, LockModeType.PESSIMISTIC_WRITE);
        if (row != null)
        {
            row.setConvex(meshCollider.getConvex());
            row.setGameObject(meshCollider.getGameObject());
            row.setMesh(meshCollider.getMesh());
            row.setMaterial(meshCollider.getMaterial());
            row.setTrigger(meshCollider.getTrigger());
            row.setCookingOptions(meshCollider.getCookingOptions());
            return true;
        }
        return false;
    }
}
