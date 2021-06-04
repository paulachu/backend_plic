package org.backend.Services.Component.Rendering;

import org.backend.Elements.Components.Rendering.Camera;
import org.backend.Elements.Components.Rendering.Light;
import org.backend.Repositories.Component.Rendering.CameraRepository;
import org.backend.Repositories.Component.Rendering.LightRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.LockModeType;
import java.util.List;

@ApplicationScoped
public class LightService {
    @Inject
    LightRepository lightRepository;
    public List<Light> getLights()
    {
        return lightRepository.listAll();
    }
    public void addNewLight(Light light)
    {
        lightRepository.persist(light);
    }
    public boolean putById(Long id, Light light)
    {
        Light row = lightRepository.findById(id, LockModeType.PESSIMISTIC_WRITE);
        if (row != null)
        {
            row.setLightType(light.getLightType());
            row.setRange(light.getRange());
            row.setSpotAngle(light.getSpotAngle());
            row.setColorR(light.getColorR());
            row.setColorG(light.getColorG());
            row.setColorB(light.getColorB());
            row.setColorA(light.getColorA());
            row.setWidth(light.getWidth());
            row.setHeight(light.getHeight());
            row.setRadius(light.getRadius());
            row.setIntensity(light.getIntensity());
            row.setIndirectMultiplier(light.getIndirectMultiplier());
            row.setCastShadows(light.isCastShadows());
            row.setCookie(light.getCookie());
            row.setDrawHalo(light.isDrawHalo());
            row.setFlare(light.getFlare());
            row.setRenderMode(light.getRenderMode());
            row.setCullingMask(light.getCullingMask());
            return true;
        }
        return false;
    }
    public boolean deleteById(Long id)
    {
        return lightRepository.deleteById(id);
    }
}
