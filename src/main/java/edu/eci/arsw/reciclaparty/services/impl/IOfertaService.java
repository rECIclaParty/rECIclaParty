package edu.eci.arsw.reciclaparty.services.impl;

import edu.eci.arsw.reciclaparty.model.services.Oferta;
import edu.eci.arsw.reciclaparty.repository.services.OfertaRepository;
import edu.eci.arsw.reciclaparty.services.OfertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;


@Component("IOfertaServices")
public class IOfertaService implements OfertaService {

    @Autowired
    private OfertaRepository ofertaRepository;


    @Override
    public List<Oferta> getAllOfertas() {
        return ofertaRepository.findAll();
    }

    @Override
    public List<Oferta> getOfertasByEmployee(UUID employeeID) {
        return ofertaRepository.findOfertasByEmployeeId(employeeID);
    }

    @Override
    public List<Oferta> getOfertasByPublicacion(UUID publicationId) {
        return ofertaRepository.findOfertasByPublicationId(publicationId);
    }

    @Override
    public int getPointsById(UUID ofertaId) {
        return ofertaRepository.findPointsByOferta(ofertaId);
    }

    @Override
    public Oferta addOferta(Oferta oferta) {
        return ofertaRepository.save(oferta);
    }

}
