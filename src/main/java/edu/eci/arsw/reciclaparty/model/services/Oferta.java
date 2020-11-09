package edu.eci.arsw.reciclaparty.model.services;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "oferta")
public class Oferta {

    @Id
    private UUID id = UUID.randomUUID();

    private long empleado;
    private long publicacion;

    private int puntos;
    private Date fecha;
    private Estado estado;

    public Oferta(){}

    public Oferta(long empleado, long publicacion, int puntos, Date fecha, Estado estado) {
        this.empleado = empleado;
        this.publicacion = publicacion;
        this.puntos = puntos;
        this.fecha = fecha;
        this.estado = estado;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public long getEmpleado() {
        return empleado;
    }

    public void setEmpleado(long empleado) {
        this.empleado = empleado;
    }

    public long getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(long publicacion) {
        this.publicacion = publicacion;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
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

    @Override
    public String toString() {
        return "Oferta{" +
                "empleado=" + empleado +
                ", publicacion=" + publicacion +
                ", puntos=" + puntos +
                ", fecha=" + fecha +
                ", estado=" + estado +
                '}';
    }
}
