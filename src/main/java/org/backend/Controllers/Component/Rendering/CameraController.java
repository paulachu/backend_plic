package org.backend.Controllers.Component.Rendering;

import org.backend.Elements.Components.Rendering.Camera;
import org.backend.Elements.Components.Rendering.Light;
import org.backend.Services.Component.Rendering.CameraService;
import org.backend.Services.Component.Rendering.LightService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/camera")
public class CameraController {
    @Inject
    CameraService cameraService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Camera> getCameras()
    {
        return cameraService.getCameras();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response addCamera(Camera camera)
    {
        cameraService.addNewCamera(camera);
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response deleteCamera(@PathParam("id") Long id)
    {
        if (cameraService.deleteById(id))
        {
            return Response.status(Response.Status.ACCEPTED).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }

    @PUT
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response putCamera(@PathParam("id") Long id, Camera camera) {
        if (cameraService.putById(id, camera)){
            return Response.status(Response.Status.ACCEPTED).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
