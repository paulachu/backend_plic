package org.backend.Services.Component.Physics;

import org.backend.Elements.Components.Physics.Rigidbody;
import org.backend.Repositories.Component.Physics.RigibodyRepository;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.LockModeType;

@ApplicationScoped
public class RigidbodyService {
    @Inject
    RigibodyRepository rigibodyRepository;
    public List<Rigidbody> getRigidbodies()
    {
        return rigibodyRepository.listAll();
    }
    public void addNewRigidbody(Rigidbody rigidbody)
    {
        rigibodyRepository.persist(rigidbody);
    }
    public boolean putById(Long id, Rigidbody rigidbody)
    {
        Rigidbody row = rigibodyRepository.findById(id, LockModeType.PESSIMISTIC_WRITE);
        if (row != null)
        {
            row.setAngularDrag(rigidbody.getAngularDrag());
            row.setDrag(rigidbody.getDrag());
            row.setCollisionDetection(rigidbody.getCollisionDetection());
            row.setFreezePosx(rigidbody.getFreezePosx());
            row.setFreezePosy(rigidbody.getFreezePosy());
            row.setFreezePosz(rigidbody.getFreezePosz());
            row.setFreezeRotx(rigidbody.getFreezeRotx());
            row.setFreezeRoty(rigidbody.getFreezeRoty());
            row.setFreezeRotz(rigidbody.getFreezeRotz());
            row.setGravity(rigidbody.getGravity());
            row.setInterpolate(rigidbody.getInterpolate());
            row.setKinematic(rigidbody.getKinematic());
            row.setMass(rigidbody.getMass());
            row.setGameObject(rigidbody.getGameObject());
            return true;
        }
        return false;
    }
    public boolean deleteById(Long id)
    {
        return rigibodyRepository.deleteById(id);
    }
}
