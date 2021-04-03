package org.backend.Controllers;

import org.backend.Elements.GameObject;
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
        gameObjectService.addNewGameObject(gameObject);
        return Response.status(Response.Status.CREATED).entity(gameObject).build();
    }
}
