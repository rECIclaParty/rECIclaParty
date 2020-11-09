package edu.eci.arsw.reciclaparty.services;


import edu.eci.arsw.reciclaparty.exception.ResourceNotFoundException;
import edu.eci.arsw.reciclaparty.model.users.Empleado;
import edu.eci.arsw.reciclaparty.model.users.User;

import java.util.List;

public interface UserServices {

    List<User> getAllUsers();
    List<Empleado> getAllEmployees();
    User addUser(User user);
    Empleado addEmployee(Empleado empleado);
    User updateUser(User user, long userId) throws ResourceNotFoundException;
    Empleado updateEmployee(Empleado empleado, long employeeId) throws ResourceNotFoundException;



}
