package edu.eci.arsw.reciclaparty.services.impl;

import edu.eci.arsw.reciclaparty.model.services.Fiesta;
import edu.eci.arsw.reciclaparty.model.services.Publicacion;
import edu.eci.arsw.reciclaparty.model.users.User;
import edu.eci.arsw.reciclaparty.repository.services.FiestaRepository;
import edu.eci.arsw.reciclaparty.repository.services.PublicacionRepository;
import edu.eci.arsw.reciclaparty.services.PublicacionServices;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class IPublicacionServices implements PublicacionServices {
    @Autowired
    private PublicacionRepository publicacionRepository;

    @Autowired
    private FiestaRepository fiestaRepository;

    @Override
    public List<Publicacion> getAllPublicaciones() {
        return publicacionRepository.findAll();
    }

    @Override
    public List<Fiesta> getAllFiestas() {
        return publicacionRepository.findAllPartysOnlyOne();
    }

    @Override
    public Optional<Publicacion> getAllPublicacionesByUser(User user) {
        return publicacionRepository.findPublicacionByIdOnlyOne(user.getId());
    }


    @Override
    public Optional<Publicacion> getAllFiestasByUser(User user) {
        return publicacionRepository.findFiestaByIdOnlyOne(user.getId());
    }



    @Override
    public void addPublicacion(Publicacion publicacion) {
        publicacionRepository.save(publicacion);
    }
}
