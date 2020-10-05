package edu.escuelaing.arsw.rECIclaParty.models.services;

import edu.escuelaing.arsw.rECIclaParty.models.users.Usuario;

import java.util.Date;

public class Publicacion{
    private int id;
    private Usuario anfitrion;
    private Valoracion valoracion;
    private Date fecha_Creacion;
    private Date fecha_Finalizacion;
    private Estado estado;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Valoracion getValoracion() {
        return valoracion;
    }

    public void setValoracion(Valoracion valoracion) {
        this.valoracion = valoracion;
    }

    public Date getFecha_Creacion() {
        return fecha_Creacion;
    }

    public void setFecha_Creacion(Date fecha_Creacion) {
        this.fecha_Creacion = fecha_Creacion;
    }

    public Date getFecha_Finalizacion() {
        return fecha_Finalizacion;
    }

    public void setFecha_Finalizacion(Date fecha_Finalizacion) {
        this.fecha_Finalizacion = fecha_Finalizacion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
