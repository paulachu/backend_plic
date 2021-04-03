package org.backend.Elements;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Scene extends WithId
{
    @Column(nullable = false)
    private String name;

    public Scene() {
    }

    public Scene(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
