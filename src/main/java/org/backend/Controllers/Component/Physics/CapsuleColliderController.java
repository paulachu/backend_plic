package org.backend.Controllers.Component.Physics;

import org.backend.Elements.Components.Mesh.MeshFilter;
import org.backend.Elements.Components.Physics.CapsuleCollider;
import org.backend.Services.Component.Physics.CapsuleColliderService;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/capsulecollider")
public class CapsuleColliderController {
    @Inject
    CapsuleColliderService capsuleColliderService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<CapsuleCollider> getCapsuleColliders()
    {
        return capsuleColliderService.getCapsuleColliders();
    }

    @POST
    @RolesAllowed("admin")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response addNewCapsuleCollider(CapsuleCollider capsuleCollider)
    {
        capsuleColliderService.addNewCapsuleCollider(capsuleCollider);
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @RolesAllowed("admin")
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response deleteCapsuleCollider(@PathParam("id") Long id)
    {
        if (capsuleColliderService.deleteById(id))
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
    public Response putCapsuleCollider(@PathParam("id") Long id, CapsuleCollider capsuleCollider) {
        if (capsuleColliderService.putById(id, capsuleCollider)){
            return Response.status(Response.Status.ACCEPTED).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
