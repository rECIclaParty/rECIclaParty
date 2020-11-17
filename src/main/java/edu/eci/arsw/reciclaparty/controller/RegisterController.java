package edu.eci.arsw.reciclaparty.controller;

import edu.eci.arsw.reciclaparty.model.users.Empleado;
import edu.eci.arsw.reciclaparty.model.users.Usuario;
import edu.eci.arsw.reciclaparty.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private UserServices uss;

    @PostMapping("/users")
    public Usuario createUser(@Valid @RequestBody Usuario usuario) {
        return uss.addUser(usuario);
    }

    @PostMapping("/employees")
    public Empleado createOtherUser(@Valid @RequestBody Empleado employee) {
        return uss.addEmployee(employee);
    }

}
