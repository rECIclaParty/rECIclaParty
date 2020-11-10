package edu.eci.arsw.reciclaparty.services.impl;

import edu.eci.arsw.reciclaparty.model.services.Objeto;
import edu.eci.arsw.reciclaparty.repository.services.ObjetoRepository;
import edu.eci.arsw.reciclaparty.services.ObjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component("IObjetoServices")
public class IObjetoService implements ObjetoService {

    @Autowired
    private ObjetoRepository objetoRepository;

    @Override
    public List<Objeto> getAllObjetos() {
        return objetoRepository.findAll();
    }

    @Override
    public Objeto getObjetoById(UUID id) {
        return objetoRepository.findById(id).get();
    }

    @Override
    public Objeto addObjeto(Objeto objeto) {
        return objetoRepository.save(objeto);
    }

    @Override
    public void deleteObjeto(UUID id) {
        Objeto objeto = objetoRepository.getOne(id);
        objetoRepository.delete(objeto);
    }
}
