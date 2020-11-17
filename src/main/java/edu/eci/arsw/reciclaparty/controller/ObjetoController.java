package edu.eci.arsw.reciclaparty.controller;


import edu.eci.arsw.reciclaparty.model.services.Objeto;
import edu.eci.arsw.reciclaparty.services.ObjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*")
public class ObjetoController {

    @Autowired
    @Qualifier("IObjetoServices")
    ObjetoService objetoServices;

    @GetMapping("/objetos")
    public List<Objeto> getAllObjetos(){
        return objetoServices.getAllObjetos();
    }


    @GetMapping("/objetos/{id}")
    public Objeto getObjetoById(@PathVariable(value = "id") UUID objetoId){
        return objetoServices.getObjetoById(objetoId);
    }

    @DeleteMapping("/objetos/{id}")
    public Map<String, Boolean> deleteObjeto(@PathVariable(value = "id") UUID objetoId){
        objetoServices.deleteObjeto(objetoId);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        //Siempre retorna eliminado!!!
        return response;
    }

    @PostMapping("/objetos")
    public Objeto createObjeto(@Valid @RequestBody Objeto objeto) {

        return objetoServices.addObjeto(objeto);
    }






}
