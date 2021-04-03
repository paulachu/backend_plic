package org.backend.Controllers.Component.Audio;

import org.backend.Elements.Components.Audio.AudioListener;
import org.backend.Services.Component.Audio.AudioListenerService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/audiolistener")
public class AudioListenerController
{
    @Inject
    AudioListenerService audioListenerService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<AudioListener> getAudioListeners()
    {
        return audioListenerService.getAudioListeners();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response addAudioListener(AudioListener audioListener)
    {
        audioListenerService.addNewAudioListener(audioListener);
        return Response.status(Response.Status.CREATED).entity(audioListener).build();
    }
}
