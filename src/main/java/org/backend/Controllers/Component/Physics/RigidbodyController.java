package org.backend.Controllers.Component.Physics;

import org.backend.Elements.Components.Physics.Rigidbody;
import org.backend.Services.Component.Physics.RigidbodyService;

import java.util.List;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/rigidbody")
public class RigidbodyController
{
    @Inject
    RigidbodyService rigidbodyService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Rigidbody> getRigidbodies()
    {
        return rigidbodyService.getRigidbodies();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response addRgigdbody(Rigidbody rigidbody)
    {
        try {
            rigidbodyService.addNewRigidbody(rigidbody);
            return Response.status(Response.Status.CREATED).build();
        } catch (Exception e) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @PUT
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response putRigidbody(@PathParam("id") Long id, Rigidbody rigidbody)
    {
        if (rigidbodyService.putById(id, rigidbody))
        {
            return Response.status(Response.Status.ACCEPTED).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }

    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response deleteRigidbody(@PathParam("id") Long id)
    {
        if (rigidbodyService.deleteById(id))
        {
            return Response.status(Response.Status.ACCEPTED).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
