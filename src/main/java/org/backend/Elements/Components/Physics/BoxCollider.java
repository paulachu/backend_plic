package org.backend.Elements.Components.Physics;

import org.backend.Elements.Component;
import org.backend.Elements.GameObject;
import org.backend.Elements.Resource;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class BoxCollider extends Component {
    private Boolean isTrigger;
    @ManyToOne
    private Resource material;
    private Float centerX;
    private Float centerY;
    private Float centerZ;
    private Float sizeX;
    private Float sizeY;
    private Float sizeZ;

    public BoxCollider()
    {}

    public BoxCollider(GameObject gameObject, Boolean isTrigger, Resource material, Float centerX, Float centerY, Float centerZ, Float sizeX, Float sizeY, Float sizeZ) {
        super(gameObject);
        this.isTrigger = isTrigger;
        this.material = material;
        this.centerX = centerX;
        this.centerY = centerY;
        this.centerZ = centerZ;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.sizeZ = sizeZ;
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

    public Float getCenterX() {
        return centerX;
    }

    public void setCenterX(Float centerX) {
        this.centerX = centerX;
    }

    public Float getCenterY() {
        return centerY;
    }

    public void setCenterY(Float centerY) {
        this.centerY = centerY;
    }

    public Float getCenterZ() {
        return centerZ;
    }

    public void setCenterZ(Float centerZ) {
        this.centerZ = centerZ;
    }

    public Float getSizeX() {
        return sizeX;
    }

    public void setSizeX(Float sizeX) {
        this.sizeX = sizeX;
    }

    public Float getSizeY() {
        return sizeY;
    }

    public void setSizeY(Float sizeY) {
        this.sizeY = sizeY;
    }

    public Float getSizeZ() {
        return sizeZ;
    }

    public void setSizeZ(Float sizeZ) {
        this.sizeZ = sizeZ;
    }
}
