package edu.eci.arsw.reciclaparty.services.impl;

import edu.eci.arsw.reciclaparty.exception.ResourceNotFoundException;
import edu.eci.arsw.reciclaparty.model.users.Empleado;
import edu.eci.arsw.reciclaparty.model.users.Usuario;
import edu.eci.arsw.reciclaparty.repository.users.*;
import edu.eci.arsw.reciclaparty.services.UserServices;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
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
    public List<Usuario> getAllUsers() {
        return userRepository.findAllOnlyOne();
    }

    @Override
    public List<Empleado> getAllEmployees() {
        return empleadoRepository.findAll();
    }

    @Override
    public Usuario getUserById(UUID userId) throws ResourceNotFoundException {
        return userRepository.findByIdOnlyOne(userId)
                .orElseThrow(() ->
                        new ResourceNotFoundException(ResourceNotFoundException.USER_NOT_FOUND + userId));
    }

    @Override
    public Empleado getEmployeeById(UUID employeeId) throws ResourceNotFoundException {
        return empleadoRepository.findById(employeeId)
                .orElseThrow(() ->
                        new ResourceNotFoundException(ResourceNotFoundException.EMPLOYEE_NOT_FOUND + employeeId));
    }

    @Override
    public Usuario addUser(Usuario usuario) {
        return userRepository.save(usuario);
    }

    @Override
    public Empleado addEmployee(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public Usuario updateUser(Usuario usuario, UUID userId) throws ResourceNotFoundException {
        Usuario user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException(ResourceNotFoundException.USER_NOT_FOUND + userId));
        user.setNombre(usuario.getNombre());
        user.setTelefono(usuario.getTelefono());
        user.setCorreo(usuario.getCorreo());
        return userRepository.save(user);
    }

    @Override
    public Empleado updateEmployee(Empleado empleado, UUID employeeId) throws ResourceNotFoundException {
        Empleado employee = empleadoRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException(ResourceNotFoundException.EMPLOYEE_NOT_FOUND+ employeeId));
        employee.setNombre(empleado.getNombre());
        employee.setTelefono(empleado.getTelefono());
        employee.setCorreo(empleado.getCorreo());
        return empleadoRepository.save(employee);
    }

    @Override
    public void deleteUser(UUID userId) throws ResourceNotFoundException {

        Usuario usuario = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException(ResourceNotFoundException.USER_NOT_FOUND + userId));
        userRepository.delete(usuario);
    }

    @Override
    public void deleteEmpleado(UUID employeeId) throws ResourceNotFoundException {
        Empleado employee = empleadoRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException(ResourceNotFoundException.EMPLOYEE_NOT_FOUND + employeeId));
        empleadoRepository.delete(employee);
    }

    @Override
    public String getPoints(UUID userId) throws ResourceNotFoundException {
        Usuario usuario = userRepository.findOnlyInUserById(userId)
                .orElseThrow(() -> new ResourceNotFoundException(ResourceNotFoundException.USER_NOT_FOUND + userId));
        StringBuilder stringBuilder = new StringBuilder("UUID: "+ usuario.getNombre());
        stringBuilder.append("Nombre:"+ usuario.getNombre());
        stringBuilder.append("Points: "+ usuario.getPuntos());
        return stringBuilder.toString();
    }

    @Override
    public boolean addPointsToUser(UUID userId, int points) throws ResourceNotFoundException {
        Usuario usuario = userRepository.findOnlyInUserById(userId)
                .orElseThrow(() -> new ResourceNotFoundException(ResourceNotFoundException.USER_NOT_FOUND + userId));
        return usuario.addPuntos(points);
    }

    @Override
    public String login(String correo, String password) {
        Optional<Usuario> user = userRepository.login(correo,password);
        if(user.isPresent()){
            String token = UUID.randomUUID().toString();
            Usuario custom= user.get();
            custom.setToken(token);
            userRepository.save(custom);
            return token;
        }

        return StringUtils.EMPTY;
    }

    @Override
    public Optional<User> findByToken(String token) {
        Optional<Usuario> usuario= userRepository.findByToken(token);
        if(usuario.isPresent()){
            Usuario customer1 = usuario.get();
            User user= new User(customer1.getCorreo(), customer1.getPassword(), true, true, true, true,
                    AuthorityUtils.createAuthorityList("USER"));
            return Optional.of(user);
        }
        return  Optional.empty();
    }


}
