package org.backend.Services.Component.Collider;

import org.backend.Elements.Components.Collider.CharacterController;
import org.backend.Repositories.Component.Collider.CharacterControllerRepository;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.LockModeType;

@ApplicationScoped
public class CharacterControllerService
{
    @Inject
    CharacterControllerRepository characterControllerRepository;

    public List<CharacterController> getCharacterControllers()
    {
        return characterControllerRepository.listAll();
    }

    public void addCharacterController(CharacterController characterController)
    {
        characterControllerRepository.persist(characterController);
    }

    public boolean deleteById(Long id)
    {
        return characterControllerRepository.deleteById(id);
    }

    public boolean putById(Long id, CharacterController characterController) {
        CharacterController row = characterControllerRepository.findById(id, LockModeType.PESSIMISTIC_WRITE);
        if (row != null)
        {
            row.setSlopeLimit(characterController.getSlopeLimit());
            row.setStepOffset(characterController.getStepOffset());
            row.setSkinWidth(characterController.getSkinWidth());
            row.setMinMoveDistance(characterController.getMinMoveDistance());
            row.setCenterX(characterController.getCenterX());
            row.setCenterY(characterController.getCenterY());
            row.setCenterZ(characterController.getCenterZ());
            row.setRadius(characterController.getRadius());
            row.setHeight(characterController.getHeight());
            row.setGameObject(characterController.getGameObject());
            return true;
        }
        return false;
    }
}
