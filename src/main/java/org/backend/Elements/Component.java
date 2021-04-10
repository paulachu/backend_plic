package org.backend.Elements;

import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract  class Component extends WithId
{
    @ManyToOne()
    protected GameObject gameObject;

    public Component()
    {
    }

    public Component(GameObject gameObject)
    {
        this.gameObject = gameObject;
    }

    public GameObject getGameObject()
    {
        return gameObject;
    }

    public void setGameObject(GameObject gameObject) {
        this.gameObject = gameObject;
    }
}