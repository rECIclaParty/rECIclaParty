package edu.eci.arsw.reciclaparty.services.impl;

import edu.eci.arsw.reciclaparty.model.services.Fiesta;
import edu.eci.arsw.reciclaparty.model.services.Publicacion;
import edu.eci.arsw.reciclaparty.repository.services.FiestaRepository;
import edu.eci.arsw.reciclaparty.repository.services.PublicacionRepository;
import edu.eci.arsw.reciclaparty.services.PublicacionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
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
        return fiestaRepository.findAllPartysOnlyOne();
    }

    @Override
    public List<Publicacion> getAllPublicacionesByUser(UUID userId) {
        return publicacionRepository.findPublicacionByIdOnlyOne(userId);
    }


    @Override
    public List<Fiesta> getAllFiestasByUser(UUID userId){
        
        return fiestaRepository.findFiestaByIdOnlyOne(userId);
    }



    @Override
    public Publicacion addPublicacion(Publicacion publicacion) {

        return publicacionRepository.save(publicacion);
    }

    @Override
    public Fiesta addPublicacion(Fiesta fiesta) {
        return fiestaRepository.save(fiesta);
    }

    @Override
    public void deletePublicacion(UUID publicacionId) {
        Publicacion publicacion = publicacionRepository.getOne(publicacionId);
        publicacionRepository.delete(publicacion);
    }

    @Override
    public void deleteFiesta(UUID fiestaId) {
        Fiesta fiesta = fiestaRepository.getOne(fiestaId);
        publicacionRepository.delete(fiesta);
    }
}
