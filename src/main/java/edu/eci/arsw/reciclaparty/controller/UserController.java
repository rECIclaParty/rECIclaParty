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


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/otherUsers")
    public List<Empleado> getAllOtherUsers() {
        return empleadoRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable(value = "id") UUID userId) throws ResourceNotFoundException {
        User user = userRepository.findByIdOnlyOne(userId)
                                    .orElseThrow(() ->
                                            new ResourceNotFoundException("Employee not found for this id :: " + userId));
        return ResponseEntity.ok().body(user);
    }

    @PostMapping("/users")
    public User createUser(@Valid @RequestBody User user) {
        return userRepository.save(user);
    }

    @PostMapping("/otherUsers")
    public Empleado createOtherUser(@Valid @RequestBody Empleado user) {
        return empleadoRepository.save(user);
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<User> updateUser(@PathVariable(value = "id") UUID userId,
                                                   @Valid @RequestBody User userDetails) throws ResourceNotFoundException {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + userId));

        user.setCorreo(userDetails.getCorreo());
        final User updatedUser = userRepository.save(user);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/users/{id}")
    public Map<String, Boolean> deleteUser(@PathVariable(value = "id") UUID userId) throws ResourceNotFoundException {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + userId));

        userRepository.delete(user);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
