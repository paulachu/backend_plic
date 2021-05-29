package org.backend.Services.Component.Rendering;

import org.backend.Elements.Components.Physics.Rigidbody;
import org.backend.Elements.Components.Rendering.Camera;
import org.backend.Repositories.Component.Physics.RigibodyRepository;
import org.backend.Repositories.Component.Rendering.CameraRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.LockModeType;
import java.util.List;

@ApplicationScoped
public class CameraService {
    @Inject
    CameraRepository cameraRepository;
    public List<Camera> getCameras()
    {
        return cameraRepository.listAll();
    }
    public void addNewCamera(Camera camera)
    {
        cameraRepository.persist(camera);
    }
    public boolean putById(Long id, Camera camera)
    {
        Camera row = cameraRepository.findById(id, LockModeType.PESSIMISTIC_WRITE);
        if (row != null)
        {
            row.setClearFlags(camera.getClearFlags());
            row.setBackgroundR(camera.getBackgroundR());
            row.setBackgroundG(camera.getBackgroundG());
            row.setBackgroundB(camera.getBackgroundB());
            row.setBackgroundA(camera.getBackgroundA());
            row.setCullingMask(camera.getCullingMask());
            row.setProjection(camera.isProjection());
            row.setFOVAxis(camera.isFOVAxis());
            row.setFieldOfView(camera.getFieldOfView());
            row.setPhysicalCamera(camera.isPhysicalCamera());
            row.setClippingPlanesNear(camera.getClippingPlanesNear());
            row.setClippingPlanesFar(camera.getClippingPlanesFar());
            row.setViewportReactX(camera.getViewportReactX());
            row.setViewportReactY(camera.getViewportReactY());
            row.setViewportReactW(camera.getViewportReactW());
            row.setViewportReactH(camera.getViewportReactH());
            row.setDepth(camera.getDepth());
            row.setRenderingPath(camera.getRenderingPath());
            row.setTargetTexture(camera.getTargetTexture());
            row.setOcclusionCulling(camera.isOcclusionCulling());
            row.setHDR(camera.isHDR());
            row.setMSAA(camera.isMSAA());
            row.setAllowDynamicResolution(camera.isAllowDynamicResolution());
            row.setTargetDisplay(camera.getTargetDisplay());
            return true;
        }
        return false;
    }
    public boolean deleteById(Long id)
    {
        return cameraRepository.deleteById(id);
    }
}
