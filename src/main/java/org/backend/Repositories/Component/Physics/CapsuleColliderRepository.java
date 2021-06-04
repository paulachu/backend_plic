package org.backend.Repositories.Component.Physics;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.backend.Elements.Components.Physics.CapsuleCollider;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CapsuleColliderRepository implements PanacheRepository<CapsuleCollider> {
}
