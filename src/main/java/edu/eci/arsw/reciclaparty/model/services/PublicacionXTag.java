package edu.eci.arsw.reciclaparty.model.services;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "publicacion_tags")
public class PublicacionXTag {
    @Id
    private UUID id = UUID.randomUUID();
    private UUID idPublicacion;
    private UUID idTag;

    public PublicacionXTag(UUID idPublicacion, UUID idTag) {
        this.idPublicacion = idPublicacion;
        this.idTag = idTag;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(UUID idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public UUID getIdTag() {
        return idTag;
    }

    public void setIdTag(UUID idTag) {
        this.idTag = idTag;
    }

    @Override
    public String toString() {
        return "PublicacionXTag{" +
                "id=" + id +
                ", idPublicacion=" + idPublicacion +
                ", idTag=" + idTag +
                '}';
    }
}
