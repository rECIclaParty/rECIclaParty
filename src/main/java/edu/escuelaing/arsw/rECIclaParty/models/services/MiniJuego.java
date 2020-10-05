package edu.escuelaing.arsw.rECIclaParty.models.services;

import edu.escuelaing.arsw.rECIclaParty.models.users.Usuario;

public class MiniJuego {
    private int id;
    private int nParticipantes;
    private String nombre;
    private Fiesta fiesta;
    private Usuario ganador;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getnParticipantes() {
        return nParticipantes;
    }

    public void setnParticipantes(int nParticipantes) {
        this.nParticipantes = nParticipantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fiesta getFiesta() {
        return fiesta;
    }

    public void setFiesta(Fiesta fiesta) {
        this.fiesta = fiesta;
    }

    public Usuario getGanador() {
        return ganador;
    }

    public void setGanador(Usuario ganador) {
        this.ganador = ganador;
    }
}
