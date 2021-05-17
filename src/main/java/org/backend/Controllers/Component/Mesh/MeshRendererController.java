package org.backend.Controllers.Component.Mesh;

import org.backend.Elements.Components.Collider.MeshCollider;
import org.backend.Elements.Components.Mesh.MeshFilter;
import org.backend.Elements.Components.Mesh.MeshRenderer;
import org.backend.Services.Component.Mesh.MeshRendererService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
@Path("/meshrenderer")
public class MeshRendererController {
    @Inject
    MeshRendererService meshRendererService;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MeshRenderer> getMeshRenderers()
    {
        return meshRendererService.getMeshRenderers();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response addNewMeshFilter(MeshRenderer meshRenderer)
    {
        meshRendererService.addMeshRenderer(meshRenderer);
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response deleteMeshFilter(@PathParam("id") Long id)
    {
        if (meshRendererService.deleteById(id))
        {
            return Response.status(Response.Status.ACCEPTED).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }

    @PUT
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response putMeshFilter(@PathParam("id") Long id, MeshRenderer meshRenderer) {
        if (meshRendererService.putById(id, meshRenderer)){
            return Response.status(Response.Status.ACCEPTED).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
