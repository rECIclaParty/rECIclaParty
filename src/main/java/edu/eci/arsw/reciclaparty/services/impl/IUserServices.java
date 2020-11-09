package edu.eci.arsw.reciclaparty.services.impl;

import edu.eci.arsw.reciclaparty.exception.ResourceNotFoundException;
import edu.eci.arsw.reciclaparty.model.users.Empleado;
import edu.eci.arsw.reciclaparty.model.users.User;
import edu.eci.arsw.reciclaparty.repository.users.*;
import edu.eci.arsw.reciclaparty.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;


@Component("IUserServices")
public class IUserServices implements UserServices {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AsociacionRepository asociacionRepository;
    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<Empleado> getAllEmployees() {
        return empleadoRepository.findAll();
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Empleado addEmployee(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public User updateUser(User usuario, UUID userId) throws ResourceNotFoundException {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + userId));

        user.setCorreo(usuario.getCorreo());
        final User updatedUser = userRepository.save(user);
        return updatedUser;
    }

    @Override
    public Empleado updateEmployee(Empleado empleado, UUID employeeId) throws ResourceNotFoundException {
        Empleado employee = empleadoRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

        employee.setCorreo(empleado.getCorreo());
        final Empleado updatedEmployee = empleadoRepository.save(employee);
        return updatedEmployee;
    }

    @Override
    public void deleteUser(UUID userId) throws ResourceNotFoundException {

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + userId));
        userRepository.delete(user);
    }

    @Override
    public void deleteEmpleado(UUID employeeId) throws ResourceNotFoundException {
        Empleado employee = userRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + userId));
        userRepository.delete(employee);
    }


}
