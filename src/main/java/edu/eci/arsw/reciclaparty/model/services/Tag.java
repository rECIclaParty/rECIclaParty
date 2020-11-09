package edu.eci.arsw.reciclaparty.model.services;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tag")
public class Tag {

    @Id
    private UUID id = UUID.randomUUID();
    private String descripcion;

    public Tag(){}

    public Tag(String descripcion) {
        this.descripcion = descripcion;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
