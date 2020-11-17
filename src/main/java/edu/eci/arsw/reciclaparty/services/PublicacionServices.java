package edu.eci.arsw.reciclaparty.services;

import edu.eci.arsw.reciclaparty.model.services.Fiesta;
import edu.eci.arsw.reciclaparty.model.services.Publicacion;

import java.util.List;
import java.util.UUID;

public interface PublicacionServices {
    List<Publicacion> getAllPublicaciones();
    List<Fiesta> getAllFiestas();
    List<Publicacion> getAllPublicacionesByUser(UUID id);
    List<Publicacion> getAllFiestasByUser(UUID id);
    Publicacion addPublicacion(Publicacion publicacion);



}