package org.backend.Repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.backend.Elements.GameObject;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GameObjectRepository implements PanacheRepository<GameObject> {
}
