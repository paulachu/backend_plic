package org.backend.Services.Component.Audio;

import org.backend.Elements.Components.Audio.AudioListener;
import org.backend.Repositories.Component.Audio.AudioListenerRepository;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class AudioListenerService
{
    @Inject
    AudioListenerRepository audioListenerRepository;
    public List<AudioListener> getAudioListeners()
    {
        return audioListenerRepository.listAll();
    }

    public void addNewAudioListener(AudioListener audioListener)
    {
        audioListenerRepository.persist(audioListener);
    }
}
