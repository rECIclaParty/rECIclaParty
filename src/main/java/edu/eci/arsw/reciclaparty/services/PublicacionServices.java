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
    List<Publicacion> getAllPublicacionesByUser(UUID userId);
    List<Fiesta> getAllFiestasByUser(UUID userId);
    Publicacion addPublicacion(Publicacion publicacion);
    Fiesta addPublicacion(Fiesta fiesta);
    void deletePublicacion(UUID publicacionId);
    void deleteFiesta(UUID fiestaId);



}