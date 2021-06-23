package org.backend.Controllers.Component.Mesh;

import org.backend.Elements.Components.Collider.MeshCollider;
import org.backend.Elements.Components.Mesh.MeshFilter;
import org.backend.Services.Component.Mesh.MeshFilterService;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/meshfilter")
public class MeshFilterController {

    @Inject
    MeshFilterService meshFilterService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MeshFilter> getMeshFilters()
    {
        return meshFilterService.getMeshFilters();
    }

    @POST
    @RolesAllowed("admin")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response addNewMeshFilter(MeshFilter meshFilter)
    {
        meshFilterService.addMeshFilter(meshFilter);
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @RolesAllowed("admin")
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response deleteMeshFilter(@PathParam("id") Long id)
    {
        if (meshFilterService.deleteById(id))
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
    public Response putMeshFilter(@PathParam("id") Long id, MeshFilter meshFilter) {
        if (meshFilterService.putById(id, meshFilter)){
            return Response.status(Response.Status.ACCEPTED).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
