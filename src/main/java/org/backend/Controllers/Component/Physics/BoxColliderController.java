package org.backend.Controllers.Component.Physics;

import org.backend.Elements.Components.Physics.BoxCollider;
import org.backend.Elements.Components.Physics.CapsuleCollider;
import org.backend.Services.Component.Physics.BoxColliderService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/boxcollider")
public class BoxColliderController {
    @Inject
    BoxColliderService boxColliderService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<BoxCollider> getBoxColliders()
    {
        return boxColliderService.getBoxColliders();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response addNewBoxCollider(BoxCollider boxCollider)
    {
        boxColliderService.addNewBoxCollider(boxCollider);
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response deleteBoxCollider(@PathParam("id") Long id)
    {
        if (boxColliderService.deleteById(id))
        {
            return Response.status(Response.Status.ACCEPTED).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }

    @PUT
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response putBoxCollider(@PathParam("id") Long id, BoxCollider boxCollider) {
        if (boxColliderService.putById(id, boxCollider)){
            return Response.status(Response.Status.ACCEPTED).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
