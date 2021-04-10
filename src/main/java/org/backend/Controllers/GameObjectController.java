package org.backend.Controllers;

import org.backend.Elements.GameObject;
import org.backend.Elements.Scene;
import org.backend.Services.GameObjectService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/gameobject")
public class GameObjectController
{
    @Inject
    GameObjectService gameObjectService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<GameObject> getGameObjects()
    {
        return gameObjectService.getGameObjects();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response addGameObject(GameObject gameObject)
    {
        try {
            gameObjectService.addNewGameObject(gameObject);
            return Response.status(Response.Status.CREATED).entity(gameObject).build();
        } catch (Exception e) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response deleteGameObject(@PathParam("id") Long id) {
        if (gameObjectService.deleteById(id)){
            return Response.status(Response.Status.ACCEPTED).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }

    @PUT
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response putGameObject(@PathParam("id") Long id, GameObject gameObject) {
        if (gameObjectService.putById(id, gameObject)){
            return Response.status(Response.Status.ACCEPTED).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
