package edu.eci.arsw.reciclaparty.services;

import edu.eci.arsw.reciclaparty.model.services.Fiesta;
import edu.eci.arsw.reciclaparty.model.services.Publicacion;
import edu.eci.arsw.reciclaparty.model.users.User;

import java.util.List;
import java.util.Optional;

public interface PublicacionServices {
    List<Publicacion> getAllPublicaciones();
    List<Fiesta> getAllFiestas();
    Optional<Publicacion> getAllPublicacionesByUser(User user);
    Optional<Publicacion> getAllFiestasByUser(User user);
    void addPublicacion(Publicacion publicacion);



}