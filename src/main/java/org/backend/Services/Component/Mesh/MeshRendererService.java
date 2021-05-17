package org.backend.Services.Component.Mesh;

import org.backend.Elements.Components.Mesh.MeshFilter;
import org.backend.Elements.Components.Mesh.MeshRenderer;
import org.backend.Repositories.Component.Mesh.MeshRendererRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.LockModeType;
import java.util.List;

@ApplicationScoped
public class MeshRendererService
{
    @Inject
    MeshRendererRepository meshRendererRepository;
    public List<MeshRenderer> getMeshRenderers()
    {
        return meshRendererRepository.listAll();
    }
    public void addMeshRenderer(MeshRenderer meshRenderer)
    {
        meshRendererRepository.persist(meshRenderer);
    }
    public boolean deleteById(Long id)
    {
        return meshRendererRepository.deleteById(id);
    }
    public boolean putById(Long id, MeshRenderer meshRenderer) {
        MeshRenderer row = meshRendererRepository.findById(id, LockModeType.PESSIMISTIC_WRITE);
        if (row != null)
        {
            row.setCastShadows(meshRenderer.getCastShadows());
            row.setDynamicOcclusion(meshRenderer.isDynamicOcclusion());
            row.setAnchorOverride(meshRenderer.getAnchorOverride());
            row.setMaterials(meshRenderer.getMaterials());
            row.setLightProbes(meshRenderer.getLightProbes());
            row.setMotionVectors(meshRenderer.getMotionVectors());
            row.setReceiveShadows(meshRenderer.isReceiveShadows());
            row.setReflectionProbes(meshRenderer.getReflectionProbes());
            row.setGameObject(meshRenderer.getGameObject());
            return true;
        }
        return false;
    }
}
