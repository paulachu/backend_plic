package org.backend.Elements.Components.Audio;

import org.backend.Elements.Component;
import org.backend.Elements.GameObject;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class AudioListener extends Component
{
    public AudioListener()
    {
    }
    public AudioListener(GameObject gameObject)
    {
        super(gameObject);
    }
}

