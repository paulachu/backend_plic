package org.backend.Controllers.Component.Rendering;

import org.backend.Elements.Components.Physics.BoxCollider;
import org.backend.Elements.Components.Rendering.Light;
import org.backend.Services.Component.Physics.BoxColliderService;
import org.backend.Services.Component.Rendering.LightService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/light")
public class LightController {
    @Inject
    LightService lightService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Light> getLights()
    {
        return lightService.getLights();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response addNewLight(Light light)
    {
        lightService.addNewLight(light);
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response deleteLight(@PathParam("id") Long id)
    {
        if (lightService.deleteById(id))
        {
            return Response.status(Response.Status.ACCEPTED).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }

    @PUT
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response putLight(@PathParam("id") Long id, Light light) {
        if (lightService.putById(id, light)){
            return Response.status(Response.Status.ACCEPTED).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
