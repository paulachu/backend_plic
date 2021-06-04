package org.backend.Elements.Components.Physics;

import org.backend.Elements.Component;
import org.backend.Elements.Enum.Direction;
import org.backend.Elements.GameObject;
import org.backend.Elements.Resource;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class CapsuleCollider extends Component {
    private Boolean isTrigger;
    @ManyToOne
    private Resource material;
    private Float centerX;
    private Float centerY;
    private Float centerZ;
    private Float radius;
    private Float height;
    private Direction direction;

    public CapsuleCollider()
    {}

    public CapsuleCollider(GameObject gameObject, Boolean isTrigger, Resource material, Float centerX, Float centerY, Float centerZ, Float radius, Float height, Direction direction) {
        super(gameObject);
        this.isTrigger = isTrigger;
        this.material = material;
        this.centerX = centerX;
        this.centerY = centerY;
        this.centerZ = centerZ;
        this.radius = radius;
        this.height = height;
        this.direction = direction;
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

    public Float getRadius() {
        return radius;
    }

    public void setRadius(Float radius) {
        this.radius = radius;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
