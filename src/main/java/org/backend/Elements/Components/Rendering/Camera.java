package org.backend.Elements.Components.Rendering;

import org.backend.Elements.Component;
import org.backend.Elements.Enum.ClearFlags;
import org.backend.Elements.Enum.RenderingPath;
import org.backend.Elements.GameObject;
import org.backend.Elements.Resource;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Camera extends Component {
    private ClearFlags clearFlags;
    private float backgroundR;
    private float backgroundG;
    private float backgroundB;
    private float backgroundA;
    private int cullingMask;
    private boolean projection;
    private boolean FOVAxis;
    private float fieldOfView;
    private boolean physicalCamera;
    private float clippingPlanesNear;
    private float clippingPlanesFar;
    private float viewportReactX;
    private float viewportReactY;
    private float viewportReactW;
    private float viewportReactH;
    private float depth;
    private RenderingPath renderingPath;
    @ManyToOne
    private Resource targetTexture;
    private boolean occlusionCulling;
    private boolean HDR;
    private boolean MSAA;
    private boolean allowDynamicResolution;
    private int targetDisplay;

    public Camera(GameObject gameObject, ClearFlags clearFlags, float backgroundR, float backgroundG, float backgroundB, float backgroundA, int cullingMask, boolean projection, boolean FOVAxis, float fieldOfView, boolean physicalCamera, float clippingPlanesNear, float clippingPlanesFar, float viewportReactX, float viewportReactY, float viewportReactW, float viewportReactH, float depth, RenderingPath renderingPath, Resource targetTexture, boolean occlusionCulling, boolean HDR, boolean MSAA, boolean allowDynamicResolution, int targetDisplay) {
        super(gameObject);
        this.clearFlags = clearFlags;
        this.backgroundR = backgroundR;
        this.backgroundG = backgroundG;
        this.backgroundB = backgroundB;
        this.backgroundA = backgroundA;
        this.cullingMask = cullingMask;
        this.projection = projection;
        this.FOVAxis = FOVAxis;
        this.fieldOfView = fieldOfView;
        this.physicalCamera = physicalCamera;
        this.clippingPlanesNear = clippingPlanesNear;
        this.clippingPlanesFar = clippingPlanesFar;
        this.viewportReactX = viewportReactX;
        this.viewportReactY = viewportReactY;
        this.viewportReactW = viewportReactW;
        this.viewportReactH = viewportReactH;
        this.depth = depth;
        this.renderingPath = renderingPath;
        this.targetTexture = targetTexture;
        this.occlusionCulling = occlusionCulling;
        this.HDR = HDR;
        this.MSAA = MSAA;
        this.allowDynamicResolution = allowDynamicResolution;
        this.targetDisplay = targetDisplay;
    }

    public Camera() {
    }

    public ClearFlags getClearFlags() {
        return clearFlags;
    }

    public void setClearFlags(ClearFlags clearFlags) {
        this.clearFlags = clearFlags;
    }

    public float getBackgroundR() {
        return backgroundR;
    }

    public void setBackgroundR(float backgroundR) {
        this.backgroundR = backgroundR;
    }

    public float getBackgroundG() {
        return backgroundG;
    }

    public void setBackgroundG(float backgroundG) {
        this.backgroundG = backgroundG;
    }

    public float getBackgroundB() {
        return backgroundB;
    }

    public void setBackgroundB(float backgroundB) {
        this.backgroundB = backgroundB;
    }

    public float getBackgroundA() {
        return backgroundA;
    }

    public void setBackgroundA(float backgroundA) {
        this.backgroundA = backgroundA;
    }

    public int getCullingMask() {
        return cullingMask;
    }

    public void setCullingMask(int cullingMask) {
        this.cullingMask = cullingMask;
    }

    public boolean isProjection() {
        return projection;
    }

    public void setProjection(boolean projection) {
        this.projection = projection;
    }

    public boolean isFOVAxis() {
        return FOVAxis;
    }

    public void setFOVAxis(boolean FOVAxis) {
        this.FOVAxis = FOVAxis;
    }

    public float getFieldOfView() {
        return fieldOfView;
    }

    public void setFieldOfView(float fieldOfView) {
        this.fieldOfView = fieldOfView;
    }

    public boolean isPhysicalCamera() {
        return physicalCamera;
    }

    public void setPhysicalCamera(boolean physicalCamera) {
        this.physicalCamera = physicalCamera;
    }

    public float getClippingPlanesNear() {
        return clippingPlanesNear;
    }

    public void setClippingPlanesNear(float clippingPlanesNear) {
        this.clippingPlanesNear = clippingPlanesNear;
    }

    public float getClippingPlanesFar() {
        return clippingPlanesFar;
    }

    public void setClippingPlanesFar(float clippingPlanesFar) {
        this.clippingPlanesFar = clippingPlanesFar;
    }

    public float getViewportReactX() {
        return viewportReactX;
    }

    public void setViewportReactX(float viewportReactX) {
        this.viewportReactX = viewportReactX;
    }

    public float getViewportReactY() {
        return viewportReactY;
    }

    public void setViewportReactY(float viewportReactY) {
        this.viewportReactY = viewportReactY;
    }

    public float getViewportReactW() {
        return viewportReactW;
    }

    public void setViewportReactW(float viewportReactW) {
        this.viewportReactW = viewportReactW;
    }

    public float getViewportReactH() {
        return viewportReactH;
    }

    public void setViewportReactH(float viewportReactH) {
        this.viewportReactH = viewportReactH;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    public RenderingPath getRenderingPath() {
        return renderingPath;
    }

    public void setRenderingPath(RenderingPath renderingPath) {
        this.renderingPath = renderingPath;
    }

    public Resource getTargetTexture() {
        return targetTexture;
    }

    public void setTargetTexture(Resource targetTexture) {
        this.targetTexture = targetTexture;
    }

    public boolean isOcclusionCulling() {
        return occlusionCulling;
    }

    public void setOcclusionCulling(boolean occlusionCulling) {
        this.occlusionCulling = occlusionCulling;
    }

    public boolean isHDR() {
        return HDR;
    }

    public void setHDR(boolean HDR) {
        this.HDR = HDR;
    }

    public boolean isMSAA() {
        return MSAA;
    }

    public void setMSAA(boolean MSAA) {
        this.MSAA = MSAA;
    }

    public boolean isAllowDynamicResolution() {
        return allowDynamicResolution;
    }

    public void setAllowDynamicResolution(boolean allowDynamicResolution) {
        this.allowDynamicResolution = allowDynamicResolution;
    }

    public int getTargetDisplay() {
        return targetDisplay;
    }

    public void setTargetDisplay(int targetDisplay) {
        this.targetDisplay = targetDisplay;
    }
}
