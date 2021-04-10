package org.backend.Repositories.Component.Collider;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.backend.Elements.Components.Collider.CharacterController;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CharacterControllerRepository implements PanacheRepository<CharacterController> {
}
