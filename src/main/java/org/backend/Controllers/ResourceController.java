package org.backend.Controllers;

import io.smallrye.common.annotation.Blocking;
import org.backend.Elements.Enum.ResourceType;
import org.backend.Elements.Resource;
import org.backend.FormData.FormData;
import org.backend.Services.ResourceService;
import org.jboss.resteasy.reactive.MultipartForm;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/resource")
public class ResourceController {
    @Inject
    ResourceService resourceService;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Resource> getResources()
    {
        return resourceService.getResources();
    }
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Resource getResourceById(@PathParam("id") Long id)
    {
        return resourceService.getById(id);
    }

    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response deleteResource(@PathParam("id") Long id) {
        if (resourceService.deleteResource(id)){
            return Response.status(Response.Status.ACCEPTED).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Transactional
    @Blocking
    public Response addResource(@MultipartForm FormData formData)
    {
        if (resourceService.addResourceMinio(formData)) {
            return Response.status(Response.Status.ACCEPTED).build();
        }
        return Response.status(Response.Status.BAD_REQUEST).build();
    }
}
