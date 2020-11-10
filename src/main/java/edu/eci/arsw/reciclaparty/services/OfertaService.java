package edu.eci.arsw.reciclaparty.services;

import edu.eci.arsw.reciclaparty.model.services.Oferta;

import java.util.List;
import java.util.UUID;

public interface OfertaService {

    List<Oferta> getAllOfertas();
    List<Oferta> getOfertasByEmployee(UUID employeeID);

    List<Oferta>  getOfertasByPublicacion(UUID publicationId);

    int getPointsById(UUID ofertaId);

    Oferta addOferta(Oferta oferta);

}
