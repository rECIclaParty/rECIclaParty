package edu.eci.arsw.reciclaparty.controller;

import edu.eci.arsw.reciclaparty.model.services.Oferta;
import edu.eci.arsw.reciclaparty.model.users.User;
import edu.eci.arsw.reciclaparty.services.OfertaService;
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
public class OfertaController {

    @Autowired
    @Qualifier("IOfertaServices")
    OfertaService ofertaServices;

    @GetMapping("/ofertas")
    public List<Oferta> getAllOfertas(){
        return  ofertaServices.getAllOfertas();
    }

    @GetMapping("/ofertas/publicacion/{id}")
    public List<Oferta> getOfertasByPublicacion(@PathVariable(value = "id") UUID id){
        return ofertaServices.getOfertasByPublicacion(id);
    }

    @GetMapping("/ofertas/employee/{id}")
    public List<Oferta> getOfertasByEmployee(@PathVariable(value = "id") UUID id){
        return ofertaServices.getOfertasByEmployee(id);
    }

    @GetMapping("/ofertas/{id}/puntos")
    public int getPointsByOferta(@PathVariable(value = "id") UUID id){
        return ofertaServices.getPointsById(id);
    }

    @PostMapping("/ofertas")
    public Oferta createOferta(@Valid @RequestBody Oferta oferta) {

        return ofertaServices.addOferta(oferta);
    }

    @DeleteMapping("/ofertas/{id}")
    public Map<String, Boolean> deleteOferta(@PathVariable(value = "id") UUID ofertaId){
        ofertaServices.deleteOferta(ofertaId);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        //Siempre retorna eliminado!!!
        return response;
    }








}
