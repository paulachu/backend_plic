package org.backend.Services;

import org.backend.Elements.GameObject;
import org.backend.Repositories.GameObjectRepository;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

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
}
