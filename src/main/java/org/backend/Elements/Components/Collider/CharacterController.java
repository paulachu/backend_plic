package org.backend.Elements.Components.Collider;

import org.backend.Elements.Component;
import org.backend.Elements.GameObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class CharacterController extends Component
{
    @Column(nullable = false)
    private Float slopeLimit;
    @Column(nullable = false)
    private Float stepOffset;
    @Column(nullable = false)
    private Float skinWidth;
    @Column(nullable = false)
    private Float minMoveDistance;
    @Column(nullable = false)
    private Float centerX;
    @Column(nullable = false)
    private Float centerY;
    @Column(nullable = false)
    private Float centerZ;
    @Column(nullable = false)
    private Float radius;
    @Column(nullable = false)
    private Float height;

    public CharacterController()
    {}
    public CharacterController(GameObject gameObject, Float slopeLimit, Float stepOffset,
                               Float skinWidth, Float minMoveDistance, Float centerX,
                               Float centerY, Float centerZ, Float radius, Float height) {
        super(gameObject);
        this.slopeLimit = slopeLimit;
        this.stepOffset = stepOffset;
        this.skinWidth = skinWidth;
        this.minMoveDistance = minMoveDistance;
        this.centerX = centerX;
        this.centerY = centerY;
        this.centerZ = centerZ;
        this.radius = radius;
        this.height = height;
    }

    public Float getSlopeLimit() {
        return slopeLimit;
    }

    public void setSlopeLimit(Float slopeLimit) {
        this.slopeLimit = slopeLimit;
    }

    public Float getStepOffset() {
        return stepOffset;
    }

    public void setStepOffset(Float stepOffset) {
        this.stepOffset = stepOffset;
    }

    public Float getSkinWidth() {
        return skinWidth;
    }

    public void setSkinWidth(Float skinWidth) {
        this.skinWidth = skinWidth;
    }

    public Float getMinMoveDistance() {
        return minMoveDistance;
    }

    public void setMinMoveDistance(Float minMoveDistance) {
        this.minMoveDistance = minMoveDistance;
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
}
