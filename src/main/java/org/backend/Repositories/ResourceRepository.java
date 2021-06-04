package org.backend.Repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.backend.Elements.Resource;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ResourceRepository implements PanacheRepository<Resource> {
}
