package org.backend.Services.Component.Physics;

import org.backend.Elements.Components.Physics.BoxCollider;
import org.backend.Elements.Components.Physics.CapsuleCollider;
import org.backend.Repositories.Component.Physics.BoxColliderRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.LockModeType;
import java.util.List;

@ApplicationScoped
public class BoxColliderService {

    @Inject
    BoxColliderRepository boxColliderRepository;

    public List<BoxCollider> getBoxColliders()
    {
        return boxColliderRepository.listAll();
    }

    public void addNewBoxCollider(BoxCollider boxCollider)
    {
        boxColliderRepository.persist(boxCollider);
    }

    public boolean deleteById(Long id)
    {
        return boxColliderRepository.deleteById(id);
    }

    public boolean putById(Long id, BoxCollider boxCollider) {
        BoxCollider row = boxColliderRepository.findById(id, LockModeType.PESSIMISTIC_WRITE);
        if (row != null)
        {
            row.setTrigger(boxCollider.getTrigger());
            row.setMaterial(boxCollider.getMaterial());
            row.setCenterX(boxCollider.getCenterX());
            row.setCenterY(boxCollider.getCenterY());
            row.setCenterZ(boxCollider.getCenterZ());
            row.setSizeX(boxCollider.getSizeX());
            row.setSizeY(boxCollider.getSizeY());
            row.setSizeZ(boxCollider.getSizeZ());
            return true;
        }
        return false;
    }
}
