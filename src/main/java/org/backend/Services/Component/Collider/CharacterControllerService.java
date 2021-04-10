package org.backend.Services.Component.Collider;

import org.backend.Elements.Components.Collider.CharacterController;
import org.backend.Repositories.Component.Collider.CharacterControllerRepository;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CharacterControllerService
{
    @Inject
    CharacterControllerRepository characterControllerRepository;

    public List<CharacterController> getCharacterControllers()
    {
        return characterControllerRepository.listAll();
    }
    public void addCharcterController(CharacterController characterController)
    {
        characterControllerRepository.persist(characterController);
    }
}
