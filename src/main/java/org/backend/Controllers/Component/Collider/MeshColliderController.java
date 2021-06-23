package org.backend.Controllers.Component.Collider;

import org.backend.Elements.Components.Collider.MeshCollider;
import org.backend.Services.Component.Collider.MeshColliderService;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/meshcollider")
public class MeshColliderController {
    @Inject
    MeshColliderService meshColliderService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MeshCollider> getMeshColliders()
    {
        return meshColliderService.getMeshColliders();
    }

    @POST
    @RolesAllowed("admin")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response addNewMeshCollider(MeshCollider meshCollider)
    {
        meshColliderService.addMeshCollider(meshCollider);
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @RolesAllowed("admin")
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response deleteMeshCollider(@PathParam("id") Long id)
    {
        if (meshColliderService.deleteById(id))
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
    public Response putMeshCollider(@PathParam("id") Long id, MeshCollider meshCollider) {
        if (meshColliderService.putById(id, meshCollider)){
            return Response.status(Response.Status.ACCEPTED).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
