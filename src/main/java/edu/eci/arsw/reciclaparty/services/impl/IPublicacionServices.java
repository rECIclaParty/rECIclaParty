package edu.eci.arsw.reciclaparty.services.impl;

import edu.eci.arsw.reciclaparty.exception.ResourceNotFoundException;
import edu.eci.arsw.reciclaparty.model.services.Fiesta;
import edu.eci.arsw.reciclaparty.model.services.Publicacion;
import edu.eci.arsw.reciclaparty.model.users.User;
import edu.eci.arsw.reciclaparty.repository.services.FiestaRepository;
import edu.eci.arsw.reciclaparty.repository.services.PublicacionRepository;
import edu.eci.arsw.reciclaparty.services.PublicacionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component("IPublicacionServices")
public class IPublicacionServices implements PublicacionServices {
    @Autowired
    private PublicacionRepository publicacionRepository;

    @Autowired
    private FiestaRepository fiestaRepository;

    @Override
    public List<Publicacion> getAllPublicaciones() {
        return publicacionRepository.findAllOnlyOne();
    }

    @Override
    public List<Fiesta> getAllFiestas() {
        return publicacionRepository.findAllPartysOnlyOne();
    }

    @Override
    public List<Publicacion> getAllPublicacionesByUser(UUID id) {
        return publicacionRepository.findPublicacionByIdOnlyOne(id);
    }


    @Override
    public List<Publicacion> getAllFiestasByUser(UUID id) {
        return publicacionRepository.findFiestaByIdOnlyOne(id);
    }



    @Override
    public Publicacion addPublicacion(Publicacion publicacion) {
        return publicacionRepository.save(publicacion);
    }
}
