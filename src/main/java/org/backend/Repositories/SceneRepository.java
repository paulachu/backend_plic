package org.backend.Repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.backend.Elements.Scene;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SceneRepository implements PanacheRepository<Scene> {
}
