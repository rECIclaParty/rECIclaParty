package edu.eci.arsw.reciclaparty.services;

import edu.eci.arsw.reciclaparty.model.services.Objeto;

import java.util.List;
import java.util.UUID;

public interface ObjetoService {
    List<Objeto> getAllObjetos();
    Objeto getObjetoById(UUID id);
    Objeto addObjeto(Objeto objeto);
    void deleteObjeto(UUID id);
}
