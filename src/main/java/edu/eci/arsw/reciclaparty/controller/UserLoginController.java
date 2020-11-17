package edu.eci.arsw.reciclaparty.controller;


import edu.eci.arsw.reciclaparty.exception.ResourceNotFoundException;
import edu.eci.arsw.reciclaparty.model.users.Usuario;
import edu.eci.arsw.reciclaparty.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v2")
public class UserLoginController {

    @Autowired
    private UserServices customerService;

    @GetMapping(value = "users/user/{id}",produces = "application/json")
    public ResponseEntity<Usuario> getUserDetail(@PathVariable UUID id){
        try {
            return ResponseEntity.ok().body(customerService.getUserById(id));
        } catch (ResourceNotFoundException e) {

            e.printStackTrace();
            return ResponseEntity.notFound().build();
        }
    }


}
