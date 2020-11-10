package edu.eci.arsw.reciclaparty.controller;

import edu.eci.arsw.reciclaparty.model.services.Oferta;
import edu.eci.arsw.reciclaparty.model.users.User;
import edu.eci.arsw.reciclaparty.services.OfertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*")
public class OfertaController {

    @Autowired
    @Qualifier("IOfertaServices")
    OfertaService ofertaService;

    @GetMapping("/ofertas")
    public List<Oferta> getAllOfertas(){
        return  ofertaService.getAllOfertas();
    }

    @GetMapping("/ofertas/publicacion/{id}")
    public List<Oferta> getOfertasByPublicacion(@PathVariable(value = "id") UUID id){
        return ofertaService.getOfertasByPublicacion(id);
    }

    @GetMapping("/ofertas/employee/{id}")
    public List<Oferta> getOfertasByEmployee(@PathVariable(value = "id") UUID id){
        return ofertaService.getOfertasByEmployee(id);
    }

    @GetMapping("/ofertas/{id}/puntos")
    public int getPointsByOferta(@PathVariable(value = "id") UUID id){
        return ofertaService.getPointsById(id);
    }

    @PostMapping("/ofertas")
    public Oferta createOferta(@Valid @RequestBody Oferta oferta) {

        return ofertaService.addOferta(oferta);
    }








}
