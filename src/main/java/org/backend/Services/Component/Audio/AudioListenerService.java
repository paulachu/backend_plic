package org.backend.Services.Component.Audio;

import org.backend.Elements.Components.Audio.AudioListener;
import org.backend.Repositories.Component.Audio.AudioListenerRepository;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.LockModeType;

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

    public boolean deleteById(Long id) {
        return audioListenerRepository.deleteById(id);
    }

    public boolean putById(Long id, AudioListener audioListener) {
        AudioListener row = audioListenerRepository.findById(id, LockModeType.PESSIMISTIC_WRITE);
        if (row != null) {

            row.setGameObject(audioListener.getGameObject());
            return true;
        }
        return false;
    }
}
