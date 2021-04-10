package org.backend.Services;

import org.backend.Elements.GameObject;
import org.backend.Repositories.GameObjectRepository;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.LockModeType;

@ApplicationScoped
public class GameObjectService
{
    @Inject
    GameObjectRepository gameObjectRepository;

    public List<GameObject> getGameObjects()
    {
        return gameObjectRepository.listAll();
    }

    public void addNewGameObject(GameObject gameObject)
    {
        gameObjectRepository.persist(gameObject);
    }

    public boolean deleteById(Long id) {
        return gameObjectRepository.deleteById(id);
    }

    public boolean putById(Long id, GameObject gameObject) {
        GameObject row = gameObjectRepository.findById(id, LockModeType.PESSIMISTIC_WRITE);
        if (row != null) {
            row.setPositionX(gameObject.getPositionX());
            row.setPositionY(gameObject.getPositionY());
            row.setPositionZ(gameObject.getPositionZ());
            row.setRotationX(gameObject.getRotationX());
            row.setRotationY(gameObject.getRotationY());
            row.setRotationZ(gameObject.getRotationZ());
            row.setScaleX(gameObject.getScaleX());
            row.setScaleY(gameObject.getScaleY());
            row.setScaleZ(gameObject.getScaleZ());
            row.setScene(gameObject.getScene());
            row.setParent(gameObject.getParent());
            row.setStatic(gameObject.getStatic());
            row.setActive(gameObject.getActive());
            row.setTag(gameObject.getTag());
            row.setLayer(gameObject.getLayer());
            return true;
        }
        return false;
    }
}
