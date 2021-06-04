package org.backend.Services.Component.Physics;

import org.backend.Elements.Components.Collider.MeshCollider;
import org.backend.Elements.Components.Physics.CapsuleCollider;
import org.backend.Elements.Components.Physics.Rigidbody;
import org.backend.Repositories.Component.Physics.CapsuleColliderRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.LockModeType;
import java.util.List;

@ApplicationScoped
public class CapsuleColliderService {
    @Inject
    CapsuleColliderRepository capsuleColliderRepository;

    public List<CapsuleCollider> getCapsuleColliders()
    {
        return capsuleColliderRepository.listAll();
    }

    public void addNewCapsuleCollider(CapsuleCollider capsuleCollider)
    {
        capsuleColliderRepository.persist(capsuleCollider);
    }

    public boolean deleteById(Long id)
    {
        return capsuleColliderRepository.deleteById(id);
    }

    public boolean putById(Long id, CapsuleCollider capsuleCollider) {
        CapsuleCollider row = capsuleColliderRepository.findById(id, LockModeType.PESSIMISTIC_WRITE);
        if (row != null)
        {
            row.setTrigger(capsuleCollider.getTrigger());
            row.setMaterial(capsuleCollider.getMaterial());
            row.setCenterX(capsuleCollider.getCenterX());
            row.setCenterY(capsuleCollider.getCenterY());
            row.setCenterZ(capsuleCollider.getCenterZ());
            row.setRadius(capsuleCollider.getRadius());
            row.setHeight(capsuleCollider.getHeight());
            row.setDirection(capsuleCollider.getDirection());
            return true;
        }
        return false;
    }
}
