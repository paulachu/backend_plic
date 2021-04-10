package org.backend.Elements.Components.Physics;

import org.backend.Elements.Component;
import org.backend.Elements.Enum.CollisionDetection;
import org.backend.Elements.Enum.Interpolate;
import org.backend.Elements.GameObject;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table
public class Rigidbody extends Component
{
    private Float mass;
    private Float drag;
    private Float angularDrag;
    private Boolean gravity;
    private Boolean kinematic;
    private Interpolate interpolate;
    private CollisionDetection collisionDetection;
    private Boolean freezePosx;
    private Boolean freezePosy;
    private Boolean freezePosz;
    private Boolean freezeRotx;
    private Boolean freezeRoty;
    private Boolean freezeRotz;

    public Rigidbody() {
    }

    public Rigidbody(GameObject gameObject, Float mass, Float drag, Float angularDrag,
                     Boolean gravity, Boolean kinematic, Interpolate interpolate,
                     CollisionDetection collisionDetection, Boolean freezePosx,
                     Boolean freezePosy, Boolean freezePosz, Boolean freezeRotx,
                     Boolean freezeRoty, Boolean freezeRotz) {
        super(gameObject);
        this.mass = mass;
        this.drag = drag;
        this.angularDrag = angularDrag;
        this.gravity = gravity;
        this.kinematic = kinematic;
        this.interpolate = interpolate;
        this.collisionDetection = collisionDetection;
        this.freezePosx = freezePosx;
        this.freezePosy = freezePosy;
        this.freezePosz = freezePosz;
        this.freezeRotx = freezeRotx;
        this.freezeRoty = freezeRoty;
        this.freezeRotz = freezeRotz;
    }

    public Float getMass() {
        return mass;
    }

    public void setMass(Float mass) {
        this.mass = mass;
    }

    public Float getDrag() {
        return drag;
    }

    public void setDrag(Float drag) {
        this.drag = drag;
    }

    public Float getAngularDrag() {
        return angularDrag;
    }

    public void setAngularDrag(Float angularDrag) {
        this.angularDrag = angularDrag;
    }

    public Boolean getGravity() {
        return gravity;
    }

    public void setGravity(Boolean gravity) {
        this.gravity = gravity;
    }

    public Boolean getKinematic() {
        return kinematic;
    }

    public void setKinematic(Boolean kinematic) {
        this.kinematic = kinematic;
    }

    public Interpolate getInterpolate() {
        return interpolate;
    }

    public void setInterpolate(Interpolate interpolate) {
        this.interpolate = interpolate;
    }

    public CollisionDetection getCollisionDetection() {
        return collisionDetection;
    }

    public void setCollisionDetection(CollisionDetection collisionDetection) {
        this.collisionDetection = collisionDetection;
    }

    public Boolean getFreezePosx() {
        return freezePosx;
    }

    public void setFreezePosx(Boolean freezePosx) {
        this.freezePosx = freezePosx;
    }

    public Boolean getFreezePosy() {
        return freezePosy;
    }

    public void setFreezePosy(Boolean freezePosy) {
        this.freezePosy = freezePosy;
    }

    public Boolean getFreezePosz() {
        return freezePosz;
    }

    public void setFreezePosz(Boolean freezePosz) {
        this.freezePosz = freezePosz;
    }

    public Boolean getFreezeRotx() {
        return freezeRotx;
    }

    public void setFreezeRotx(Boolean freezeRotx) {
        this.freezeRotx = freezeRotx;
    }

    public Boolean getFreezeRoty() {
        return freezeRoty;
    }

    public void setFreezeRoty(Boolean freezeRoty) {
        this.freezeRoty = freezeRoty;
    }

    public Boolean getFreezeRotz() {
        return freezeRotz;
    }

    public void setFreezeRotz(Boolean freezeRotz) {
        this.freezeRotz = freezeRotz;
    }
}
