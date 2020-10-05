package edu.escuelaing.arsw.rECIclaParty.models.services;

import edu.escuelaing.arsw.rECIclaParty.models.users.Cliente;

import java.util.Date;
import java.util.HashMap;

public class Fiesta extends Publicacion {
    private int identificador;
    private Date startDate;
    private Date endDate;
    private HashMap< String, Cliente> participantes;
    private MiniJuego miniJuego;


}
