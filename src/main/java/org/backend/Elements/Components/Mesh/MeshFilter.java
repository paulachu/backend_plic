package org.backend.Elements.Components.Mesh;

import org.backend.Elements.Component;
import org.backend.Elements.GameObject;
import org.backend.Elements.Resource;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class MeshFilter extends Component {
    @ManyToOne
    private Resource mesh;

    public MeshFilter()
    {}

    public MeshFilter(GameObject gameObject, Resource mesh)
    {
        super(gameObject);
        this.mesh = mesh;
    }

    public Resource getMesh() {
        return mesh;
    }

    public void setMesh(Resource mesh) {
        this.mesh = mesh;
    }
}
