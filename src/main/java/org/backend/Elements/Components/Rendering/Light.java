package org.backend.Elements.Components.Rendering;

import org.backend.Elements.Component;
import org.backend.Elements.Enum.LightType;
import org.backend.Elements.Enum.RenderMode;
import org.backend.Elements.GameObject;
import org.backend.Elements.Resource;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Light extends Component {
    private LightType lightType;
    private float range;
    private float spotAngle;
    private float colorR;
    private float colorG;
    private float colorB;
    private float colorA;
    private float width;
    private float height;
    private float radius;
    private float intensity;
    private float indirectMultiplier;
    private boolean castShadows;
    @ManyToOne
    private Resource cookie;
    private boolean drawHalo;
    @ManyToOne
    private Resource flare;
    private RenderMode  renderMode;
    private int cullingMask;

    public Light(GameObject gameObject, LightType lightType, float range, float spotAngle, float colorR, float colorG, float colorB, float colorA, float width, float height, float radius, float intensity, float indirectMultiplier, boolean castShadows, Resource cookie, boolean drawHalo, Resource flare, RenderMode renderMode, int cullingMask) {
        super(gameObject);
        this.lightType = lightType;
        this.range = range;
        this.spotAngle = spotAngle;
        this.colorR = colorR;
        this.colorG = colorG;
        this.colorB = colorB;
        this.colorA = colorA;
        this.width = width;
        this.height = height;
        this.radius = radius;
        this.intensity = intensity;
        this.indirectMultiplier = indirectMultiplier;
        this.castShadows = castShadows;
        this.cookie = cookie;
        this.drawHalo = drawHalo;
        this.flare = flare;
        this.renderMode = renderMode;
        this.cullingMask = cullingMask;
    }

    public Light() {
    }

    public LightType getLightType() {
        return lightType;
    }

    public void setLightType(LightType lightType) {
        this.lightType = lightType;
    }

    public float getRange() {
        return range;
    }

    public void setRange(float range) {
        this.range = range;
    }

    public float getSpotAngle() {
        return spotAngle;
    }

    public void setSpotAngle(float spotAngle) {
        this.spotAngle = spotAngle;
    }

    public float getColorR() {
        return colorR;
    }

    public void setColorR(float colorR) {
        this.colorR = colorR;
    }

    public float getColorG() {
        return colorG;
    }

    public void setColorG(float colorG) {
        this.colorG = colorG;
    }

    public float getColorB() {
        return colorB;
    }

    public void setColorB(float colorB) {
        this.colorB = colorB;
    }

    public float getColorA() {
        return colorA;
    }

    public void setColorA(float colorA) {
        this.colorA = colorA;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getIntensity() {
        return intensity;
    }

    public void setIntensity(float intensity) {
        this.intensity = intensity;
    }

    public float getIndirectMultiplier() {
        return indirectMultiplier;
    }

    public void setIndirectMultiplier(float indirectMultiplier) {
        this.indirectMultiplier = indirectMultiplier;
    }

    public boolean isCastShadows() {
        return castShadows;
    }

    public void setCastShadows(boolean castShadows) {
        this.castShadows = castShadows;
    }

    public Resource getCookie() {
        return cookie;
    }

    public void setCookie(Resource cookie) {
        this.cookie = cookie;
    }

    public boolean isDrawHalo() {
        return drawHalo;
    }

    public void setDrawHalo(boolean drawHalo) {
        this.drawHalo = drawHalo;
    }

    public Resource getFlare() {
        return flare;
    }

    public void setFlare(Resource flare) {
        this.flare = flare;
    }

    public RenderMode getRenderMode() {
        return renderMode;
    }

    public void setRenderMode(RenderMode renderMode) {
        this.renderMode = renderMode;
    }

    public int getCullingMask() {
        return cullingMask;
    }

    public void setCullingMask(int cullingMask) {
        this.cullingMask = cullingMask;
    }
}
