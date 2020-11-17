package edu.eci.arsw.reciclaparty.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.validation.Valid;

import edu.eci.arsw.reciclaparty.exception.ResourceNotFoundException;
import edu.eci.arsw.reciclaparty.model.services.Fiesta;
import edu.eci.arsw.reciclaparty.model.services.Publicacion;
import edu.eci.arsw.reciclaparty.model.users.Empleado;
import edu.eci.arsw.reciclaparty.model.users.Usuario;


import edu.eci.arsw.reciclaparty.services.PublicacionServices;
import edu.eci.arsw.reciclaparty.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    @Qualifier("IUserServices")
    private UserServices uss;




    @GetMapping("/users")
    public List<Usuario> getAllUsers() {
        return uss.getAllUsers();
    }

    @GetMapping("/employees")
    public List<Empleado> getAllEmployees() {
        return uss.getAllEmployees();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<Usuario> getUserById(@PathVariable(value = "id") UUID userId) throws ResourceNotFoundException {
        Usuario usuario = uss.getUserById(userId);
        return ResponseEntity.ok().body(usuario);
    }

    @GetMapping("/users/{id}/points")
    public ResponseEntity<String> getPointsByUser(@PathVariable(value = "id") UUID userId) throws ResourceNotFoundException {
        String info = uss.getPoints(userId);
        return ResponseEntity.ok().body(info);
    }

    @GetMapping("/users/{id}/points/{points}")
    public ResponseEntity<String> getPointsByUser(@PathVariable(value = "id") UUID userId, @PathVariable(value = "points") int points) throws ResourceNotFoundException {
        uss.addPointsToUser(userId,points);
        return ResponseEntity.ok().body("UUID: "+userId+", points: "+points);
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<Empleado> getEmployeeById(@PathVariable(value = "id") UUID userId) throws ResourceNotFoundException {
        Empleado employee = uss.getEmployeeById(userId);
        return ResponseEntity.ok().body(employee);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<Usuario> updateUser(@PathVariable(value = "id") UUID userId,
                                              @Valid @RequestBody Usuario usuarioDetails) throws ResourceNotFoundException {

        final Usuario updatedUsuario = uss.updateUser(usuarioDetails,userId);
        return ResponseEntity.ok(updatedUsuario);
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<Empleado> updateEmployee(@PathVariable(value = "id") UUID employeeId,
                                           @Valid @RequestBody Empleado employeeDetails) throws ResourceNotFoundException {

        final Empleado updatedEmployee = uss.updateEmployee(employeeDetails,employeeId);
        return ResponseEntity.ok(updatedEmployee);
    }

    @DeleteMapping("/users/{id}")
    public Map<String, Boolean> deleteUser(@PathVariable(value = "id") UUID userId) throws ResourceNotFoundException {
        uss.deleteUser(userId);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

    @DeleteMapping("/employees/{id}")
    public Map<String, Boolean> deleteEmployees(@PathVariable(value = "id") UUID employeeId) throws ResourceNotFoundException {
        uss.deleteEmpleado(employeeId);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }



}
