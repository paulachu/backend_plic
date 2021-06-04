package org.backend.Elements;

import org.backend.Elements.Enum.ResourceType;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Resource extends WithId{
    private String name;
    private ResourceType type;
    private String path;
    public Resource() {
    }

    public Resource(String name, ResourceType type) {
        this.name = name;
        this.type = type;
        this.path = type.name() + "/" + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResourceType getType() {
        return type;
    }

    public void setType(ResourceType type) {
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
