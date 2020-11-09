package edu.eci.arsw.reciclaparty.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.validation.Valid;

import edu.eci.arsw.reciclaparty.exception.ResourceNotFoundException;
import edu.eci.arsw.reciclaparty.model.users.Empleado;
import edu.eci.arsw.reciclaparty.model.users.User;
import edu.eci.arsw.reciclaparty.repository.users.EmpleadoRepository;
import edu.eci.arsw.reciclaparty.repository.users.UserRepository;


import edu.eci.arsw.reciclaparty.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    @Qualifier("IUserServices")
    private UserServices uss;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return uss.getAllUsers();
    }

    @GetMapping("/employees")
    public List<Empleado> getAllEmployees() {
        return uss.getAllEmployees();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable(value = "id") UUID userId) throws ResourceNotFoundException {
        User user = uss.getUserById(userId);
        return ResponseEntity.ok().body(user);
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<Empleado> getEmployeeById(@PathVariable(value = "id") UUID userId) throws ResourceNotFoundException {
        Empleado employee = uss.getEmployeeById(userId);
        return ResponseEntity.ok().body(employee);
    }

    @PostMapping("/users")
    public User createUser(@Valid @RequestBody User user) {
        return uss.addUser(user);
    }

    @PostMapping("/employees")
    public Empleado createOtherUser(@Valid @RequestBody Empleado employee) {
        return uss.addEmployee(employee);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable(value = "id") UUID userId,
                                                   @Valid @RequestBody User userDetails) throws ResourceNotFoundException {

        final User updatedUser = uss.updateUser(userDetails,userId);
        return ResponseEntity.ok(updatedUser);
    }

    @PutMapping("/employee/{id}")
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
