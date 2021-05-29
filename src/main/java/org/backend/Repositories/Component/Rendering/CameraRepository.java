package org.backend.Repositories.Component.Rendering;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.backend.Elements.Components.Rendering.Camera;
import org.backend.Elements.GameObject;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CameraRepository implements PanacheRepository<Camera> {
}
