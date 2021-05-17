package org.backend.Repositories.Component.Mesh;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.backend.Elements.Components.Mesh.MeshRenderer;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MeshRendererRepository implements PanacheRepository<MeshRenderer> {
}
