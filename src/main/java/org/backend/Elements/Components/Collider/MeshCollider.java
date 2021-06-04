package org.backend.Elements.Components.Collider;

import org.backend.Elements.Component;
import org.backend.Elements.Enum.CookingOptions;
import org.backend.Elements.GameObject;
import org.backend.Elements.Resource;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class MeshCollider extends Component
{
    private Boolean convex;
    private Boolean isTrigger;
    @ManyToOne
    private Resource material;
    @ManyToOne
    private Resource mesh;
    @ElementCollection
    private Set<CookingOptions> cookingOptions;

    public MeshCollider()
    {}

    public MeshCollider(GameObject gameObject, Boolean convex, Boolean isTrigger, Resource material, Resource mesh, Set<CookingOptions> options)
    {
        super(gameObject);
        this.convex = convex;
        this.isTrigger = isTrigger;
        this.material = material;
        this.mesh = mesh;
        this.cookingOptions = options;
    }

    public Boolean getConvex() {
        return convex;
    }

    public void setConvex(Boolean convex) {
        this.convex = convex;
    }

    public Boolean getTrigger() {
        return isTrigger;
    }

    public void setTrigger(Boolean trigger) {
        isTrigger = trigger;
    }

    public Resource getMaterial() {
        return material;
    }

    public void setMaterial(Resource material) {
        this.material = material;
    }

    public Resource getMesh() {
        return mesh;
    }

    public void setMesh(Resource mesh) {
        this.mesh = mesh;
    }

    public Set<CookingOptions> getCookingOptions() {
        return cookingOptions;
    }

    public void setCookingOptions(Set<CookingOptions> cookingOptions) {
        this.cookingOptions = cookingOptions;
    }
}
