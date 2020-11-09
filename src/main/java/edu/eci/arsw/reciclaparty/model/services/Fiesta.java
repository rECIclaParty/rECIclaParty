package edu.eci.arsw.reciclaparty.model.services;


import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "fiesta")
public class Fiesta extends Publicacion {

    private int participantes;
    private Date hora_inicio;
    private Date hora_final;
    private int puntos;
    private int actividad;

    public Fiesta(){

    }

    public Fiesta(int participantes, Date hora_inicio, Date hora_final, int puntos, int actividad) {
        this.participantes = participantes;
        this.hora_inicio = hora_inicio;
        this.hora_final = hora_final;
        this.puntos = puntos;
        this.actividad = actividad;
    }

    public Fiesta(Date fecha, Estado estado, int objeto, long usuario, int participantes, Date hora_inicio, Date hora_final, int puntos, int actividad) {
        super(fecha, estado, objeto, usuario);
        this.participantes = participantes;
        this.hora_inicio = hora_inicio;
        this.hora_final = hora_final;
        this.puntos = puntos;
        this.actividad = actividad;
    }

    public int getParticipantes() {
        return participantes;
    }

    public void setParticipantes(int participantes) {
        this.participantes = participantes;
    }

    public Date getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(Date hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public Date getHora_final() {
        return hora_final;
    }

    public void setHora_final(Date hora_final) {
        this.hora_final = hora_final;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getActividad() {
        return actividad;
    }

    public void setActividad(int actividad) {
        this.actividad = actividad;
    }

    @Override
    public String toString() {
        return "Fiesta{" +
                "participantes=" + participantes +
                ", hora_inicio=" + hora_inicio +
                ", hora_final=" + hora_final +
                ", puntos=" + puntos +
                ", actividad=" + actividad +
                '}';
    }
}
