package edu.eci.arsw.reciclaparty.controller;



import edu.eci.arsw.reciclaparty.model.services.Fiesta;
import edu.eci.arsw.reciclaparty.model.services.Publicacion;
import edu.eci.arsw.reciclaparty.services.PublicacionServices;
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
public class PublicationsController {

    @Autowired
    @Qualifier("IPublicacionServices")
    private PublicacionServices publicacionServices;


    @GetMapping("/publications")
    public List<Publicacion> getAllPublications(){

        return publicacionServices.getAllPublicaciones();

    }

    @GetMapping("/publications/{id}")
    public List<Publicacion> getAllPublicationsByUser(@PathVariable(value = "id") UUID userId){
        return publicacionServices.getAllPublicacionesByUser(userId);
    }

    @PostMapping("/publications")
    public Publicacion createPublication(@Valid @RequestBody Publicacion publicacion) {
        return publicacionServices.addPublicacion(publicacion);
    }

    @DeleteMapping("/publications/{id}")
    public Map<String, Boolean> deletePublicacion(@PathVariable(value = "id") UUID publicacionId){
        publicacionServices.deletePublicacion(publicacionId);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

    @PostMapping("/parties")
    public Publicacion createParty(@Valid @RequestBody Fiesta fiesta) {
        return publicacionServices.addPublicacion(fiesta);
    }

    @GetMapping("/parties")
    public List<Fiesta> getAllParties(){
        return publicacionServices.getAllFiestas();
    }

    @GetMapping("/parties/{id}")
    public List<Fiesta> getAllPartiesByUser(@PathVariable(value = "id") UUID userId){
        return publicacionServices.getAllFiestasByUser(userId);
    }

    @DeleteMapping("/parties/{id}")
    public Map<String, Boolean> deleteFiesta(@PathVariable(value = "id") UUID fiestaId){
        publicacionServices.deletePublicacion(fiestaId);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }


}
