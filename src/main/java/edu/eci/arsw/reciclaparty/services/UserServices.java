package edu.eci.arsw.reciclaparty.services;


import edu.eci.arsw.reciclaparty.exception.ResourceNotFoundException;
import edu.eci.arsw.reciclaparty.model.users.Empleado;
import edu.eci.arsw.reciclaparty.model.users.User;

import java.util.List;
import java.util.UUID;

public interface UserServices {

    List<User> getAllUsers();
    List<Empleado> getAllEmployees();
    User getUserById(UUID userId) throws ResourceNotFoundException;
    Empleado getEmployeeById(UUID employeeId) throws ResourceNotFoundException;
    User addUser(User user);
    Empleado addEmployee(Empleado empleado);
    User updateUser(User user, UUID userId) throws ResourceNotFoundException;
    Empleado updateEmployee(Empleado empleado, UUID employeeId) throws ResourceNotFoundException;
    void deleteUser(UUID userId) throws  ResourceNotFoundException;
    void deleteEmpleado(UUID employeeId) throws  ResourceNotFoundException;


}
