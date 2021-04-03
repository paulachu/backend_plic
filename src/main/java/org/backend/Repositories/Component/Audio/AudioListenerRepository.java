package org.backend.Repositories.Component.Audio;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.backend.Elements.Components.Audio.AudioListener;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AudioListenerRepository implements PanacheRepository<AudioListener> {
}
