package org.backend.Controllers;

import org.backend.Elements.Scene;
import org.backend.Services.SceneService;

import java.util.List;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/scene")
public class SceneController
{
    @Inject
    SceneService sceneService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Scene> getScenes()
    {
        return sceneService.getScenes();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response addScene(Scene scene)
    {
        try {
            sceneService.addNewScene(scene);
            return Response.status(Response.Status.CREATED).build();
        } catch (Exception e) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response deleteScene(@PathParam("id") Long id) {
        if (sceneService.deleteById(id)){
            return Response.status(Response.Status.ACCEPTED).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }

    @PUT
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response putScene(@PathParam("id") Long id, Scene scene) {
        if (sceneService.putById(id, scene)){
            return Response.status(Response.Status.ACCEPTED).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
