package edu.eci.arsw.reciclaparty.services;

import edu.eci.arsw.reciclaparty.exception.ResourceNotFoundException;
import edu.eci.arsw.reciclaparty.model.services.Fiesta;
import edu.eci.arsw.reciclaparty.model.services.Publicacion;
import edu.eci.arsw.reciclaparty.model.users.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PublicacionServices {
    List<Publicacion> getAllPublicaciones();
    List<Fiesta> getAllFiestas();
    List<Publicacion> getAllPublicacionesByUser(UUID id);
    List<Fiesta> getAllFiestasByUser(UUID id);
    Publicacion addPublicacion(Publicacion publicacion);



}