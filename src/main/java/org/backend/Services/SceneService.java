package org.backend.Services;

import java.util.List;
import org.backend.Elements.Scene;
import org.backend.Repositories.SceneRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.LockModeType;

@ApplicationScoped
public class SceneService
{
    @Inject
    SceneRepository sceneRepository;

    public List<Scene> getScenes()
    {
        return sceneRepository.listAll();
    }

    public void addNewScene(Scene scene)
    {
        sceneRepository.persist(scene);
    }

    public boolean deleteById(Long id) {
        return sceneRepository.deleteById(id);
    }

    public boolean putById(Long id, Scene scene) {
        Scene row = sceneRepository.findById(id, LockModeType.PESSIMISTIC_WRITE);
        if (row != null) {
            row.setName(scene.getName());
            return true;
        }
        return false;
    }
}
