package edu.eci.arsw.reciclaparty.model.services;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="publicacion")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    private Date fecha;
    private Estado estado;
    private int objeto;
    private String usuario;


    public Publicacion(){

    }
    public Publicacion(Date fecha, Estado estado, int objeto, String usuario) {
        this.fecha = fecha;
        this.estado = estado;
        this.objeto = objeto;
        this.usuario = usuario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
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
