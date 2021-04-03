package org.backend.Services;

import java.util.List;
import org.backend.Elements.Scene;
import org.backend.Repositories.SceneRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

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
}
