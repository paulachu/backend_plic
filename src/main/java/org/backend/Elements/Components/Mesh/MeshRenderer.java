package org.backend.Elements.Components.Mesh;

import org.backend.Elements.Component;
import org.backend.Elements.Enum.CastShadows;
import org.backend.Elements.Enum.LightProbesUsage;
import org.backend.Elements.Enum.MotionVectors;
import org.backend.Elements.Enum.ReflectionProbes;
import org.backend.Elements.GameObject;
import org.backend.Elements.Resource;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class MeshRenderer extends Component {

    @ManyToMany
    private Set<Resource> materials;
    private CastShadows castShadows;
    private boolean receiveShadows;
    private LightProbesUsage lightProbes;
    private ReflectionProbes reflectionProbes;
    @ManyToOne(optional = true)
    private GameObject anchorOverride;
    private MotionVectors motionVectors;
    private boolean dynamicOcclusion;

    public MeshRenderer()
    {}
    public MeshRenderer(GameObject gameObject, Set<Resource> materials,
                        CastShadows castShadows, boolean receiveShadows,
                        LightProbesUsage lightProbes, ReflectionProbes reflectionProbes,
                        GameObject anchorOverride, MotionVectors motionVectors, boolean dynamicOcclusion) {
        super(gameObject);
        this.materials = materials;
        this.castShadows = castShadows;
        this.receiveShadows = receiveShadows;
        this.lightProbes = lightProbes;
        this.reflectionProbes = reflectionProbes;
        this.anchorOverride = anchorOverride;
        this.motionVectors = motionVectors;
        this.dynamicOcclusion = dynamicOcclusion;
    }

    public Set<Resource> getMaterials() {
        return materials;
    }

    public void setMaterials(Set<Resource> materials) {
        this.materials = materials;
    }

    public CastShadows getCastShadows() {
        return castShadows;
    }

    public void setCastShadows(CastShadows castShadows) {
        this.castShadows = castShadows;
    }

    public boolean isReceiveShadows() {
        return receiveShadows;
    }

    public void setReceiveShadows(boolean receiveShadows) {
        this.receiveShadows = receiveShadows;
    }

    public LightProbesUsage getLightProbes() {
        return lightProbes;
    }

    public void setLightProbes(LightProbesUsage lightProbes) {
        this.lightProbes = lightProbes;
    }

    public ReflectionProbes getReflectionProbes() {
        return reflectionProbes;
    }

    public void setReflectionProbes(ReflectionProbes reflectionProbes) {
        this.reflectionProbes = reflectionProbes;
    }

    public GameObject getAnchorOverride() {
        return anchorOverride;
    }

    public void setAnchorOverride(GameObject anchorOverride) {
        this.anchorOverride = anchorOverride;
    }

    public MotionVectors getMotionVectors() {
        return motionVectors;
    }

    public void setMotionVectors(MotionVectors motionVectors) {
        this.motionVectors = motionVectors;
    }

    public boolean isDynamicOcclusion() {
        return dynamicOcclusion;
    }

    public void setDynamicOcclusion(boolean dynamicOcclusion) {
        this.dynamicOcclusion = dynamicOcclusion;
    }
}
