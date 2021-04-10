package org.backend.Controllers.Component.Collider;

import org.backend.Elements.Components.Collider.CharacterController;
import org.backend.Services.Component.Collider.CharacterControllerService;

import java.util.List;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/charactercontroller")
public class CharacterControllerController
{
    @Inject
    CharacterControllerService characterControllerService;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<CharacterController> getCharacterControllers()
    {
        return characterControllerService.getCharacterControllers();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response addNewCharacterController(CharacterController characterController)
    {
        characterControllerService.addCharcterController(characterController);
        return Response.status(Response.Status.CREATED).entity(characterController).build();
    }
}
