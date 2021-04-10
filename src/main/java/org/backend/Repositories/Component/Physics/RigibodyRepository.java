package org.backend.Repositories.Component.Physics;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.backend.Elements.Components.Physics.Rigidbody;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RigibodyRepository implements PanacheRepository<Rigidbody> {
}
