package edu.eci.arsw.reciclaparty.model.services;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="publicacion")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Publicacion {
    @Id
    private UUID id = UUID.randomUUID();
    private Date fecha;
    private Estado estado;
    private int objeto;
    private long usuario;


    public Publicacion(){

    }
    public Publicacion(Date fecha, Estado estado, int objeto, long usuario) {
        this.fecha = fecha;
        this.estado = estado;
        this.objeto = objeto;
        this.usuario = usuario;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getObjeto() {
        return objeto;
    }

    public void setObjeto(int objeto) {
        this.objeto = objeto;
    }

    public long getUsuario() {
        return usuario;
    }

    public void setUsuario(long usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", estado='" + estado + '\'' +
                ", objeto=" + objeto +
                ", usuario='" + usuario + '\'' +
                '}';
    }
}
