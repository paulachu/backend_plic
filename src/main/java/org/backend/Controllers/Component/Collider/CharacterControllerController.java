package org.backend.Controllers.Component.Collider;

import org.backend.Elements.Components.Audio.AudioListener;
import org.backend.Elements.Components.Collider.CharacterController;
import org.backend.Services.Component.Collider.CharacterControllerService;

import java.util.List;
import javax.annotation.security.RolesAllowed;
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
    @RolesAllowed("admin")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response addNewCharacterController(CharacterController characterController)
    {
        characterControllerService.addCharacterController(characterController);
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @RolesAllowed("admin")
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response deleteCharacterController(@PathParam("id") Long id)
    {
        if (characterControllerService.deleteById(id))
        {
            return Response.status(Response.Status.ACCEPTED).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }

    @PUT
    @RolesAllowed("admin")
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response putCharacterController(@PathParam("id") Long id, CharacterController characterController) {
        if (characterControllerService.putById(id, characterController)){
            return Response.status(Response.Status.ACCEPTED).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
