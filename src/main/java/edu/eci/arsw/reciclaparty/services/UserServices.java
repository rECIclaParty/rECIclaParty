package edu.eci.arsw.reciclaparty.services;


import edu.eci.arsw.reciclaparty.exception.ResourceNotFoundException;
import edu.eci.arsw.reciclaparty.model.users.Empleado;
import edu.eci.arsw.reciclaparty.model.users.Usuario;
import org.springframework.security.core.userdetails.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserServices {

    /*Principales Servicios*/
    List<Usuario> getAllUsers();
    List<Empleado> getAllEmployees();
    Usuario getUserById(UUID userId) throws ResourceNotFoundException;
    Empleado getEmployeeById(UUID employeeId) throws ResourceNotFoundException;
    Usuario addUser(Usuario usuario);
    Empleado addEmployee(Empleado empleado);
    Usuario updateUser(Usuario usuario, UUID userId) throws ResourceNotFoundException;
    Empleado updateEmployee(Empleado empleado, UUID employeeId) throws ResourceNotFoundException;
    void deleteUser(UUID userId) throws  ResourceNotFoundException;
    void deleteEmpleado(UUID employeeId) throws  ResourceNotFoundException;

    /*Servicios Añadidos*/
    String getPoints(UUID userId) throws  ResourceNotFoundException;
    boolean addPointsToUser(UUID userId, int points) throws ResourceNotFoundException;
    String login(String correo, String password);
    Optional<User> findByToken(String token);
}
