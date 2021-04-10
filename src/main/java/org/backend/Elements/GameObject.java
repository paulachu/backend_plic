package org.backend.Elements;

import javax.persistence.*;

@Entity
@Table
public class GameObject extends WithId {
    @Column(nullable = false)
    private Float positionX;
    @Column(nullable = false)
    private Float positionY;
    @Column(nullable = false)
    private Float positionZ;
    @Column(nullable = false)
    private Float rotationX;
    @Column(nullable = false)
    private Float rotationY;
    @Column(nullable = false)
    private Float rotationZ;
    @Column(nullable = false)
    private Float scaleX;
    @Column(nullable = false)
    private Float scaleY;
    @Column(nullable = false)
    private Float scaleZ;
    @ManyToOne
    private Scene scene;
    @ManyToOne
    private GameObject parent;
    @Column(nullable = false)
    private Boolean isStatic;
    @Column(nullable = false)
    private Boolean isActive;
    private String tag;
    //TODO: check if need to implement layer
    private Long layer;
    public GameObject() {
    }

    public GameObject(Float positionX, Float positionY, Float positionZ, Float rotationX, Float rotationY,
                      Float rotationZ, Float scaleX, Float scaleY, Float scaleZ, Scene scene, GameObject parent,
                      Boolean isStatic, Boolean isActive, String tag, Long layer) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.positionZ = positionZ;
        this.rotationX = rotationX;
        this.rotationY = rotationY;
        this.rotationZ = rotationZ;
        this.scaleX = scaleX;
        this.scaleY = scaleY;
        this.scaleZ = scaleZ;
        this.scene = scene;
        this.parent = parent;
        this.isStatic = isStatic;
        this.isActive = isActive;
        this.tag = tag;
        this.layer = layer;
    }

    public Float getPositionX() {
        return positionX;
    }

    public void setPositionX(Float positionX) {
        this.positionX = positionX;
    }

    public Float getPositionY() {
        return positionY;
    }

    public void setPositionY(Float positionY) {
        this.positionY = positionY;
    }

    public Float getPositionZ() {
        return positionZ;
    }

    public void setPositionZ(Float positionZ) {
        this.positionZ = positionZ;
    }

    public Float getRotationX() {
        return rotationX;
    }

    public void setRotationX(Float rotationX) {
        this.rotationX = rotationX;
    }

    public Float getRotationY() {
        return rotationY;
    }

    public void setRotationY(Float rotationY) {
        this.rotationY = rotationY;
    }

    public Float getRotationZ() {
        return rotationZ;
    }

    public void setRotationZ(Float rotationZ) {
        this.rotationZ = rotationZ;
    }

    public Float getScaleX() {
        return scaleX;
    }

    public void setScaleX(Float scaleX) {
        this.scaleX = scaleX;
    }

    public Float getScaleY() {
        return scaleY;
    }

    public void setScaleY(Float scaleY) {
        this.scaleY = scaleY;
    }

    public Float getScaleZ() {
        return scaleZ;
    }

    public void setScaleZ(Float scaleZ) {
        this.scaleZ = scaleZ;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public GameObject getParent() {
        if (parent != null) {
            return parent;
        }
        return null;
    }

    public void setParent(GameObject parent) {
        this.parent = parent;
    }

    public Boolean getStatic() {
        return isStatic;
    }

    public void setStatic(Boolean aStatic) {
        isStatic = aStatic;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Long getLayer() {
        return layer;
    }

    public void setLayer(Long layer) {
        this.layer = layer;
    }

}
