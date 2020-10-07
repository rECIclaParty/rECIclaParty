package edu.escuelaing.arsw.rECIclaParty.models.services;

import edu.escuelaing.arsw.rECIclaParty.models.users.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<Usuario,Integer> {
    Usuario getByCorreo(String correo);

    List<Usuario> getByGenero(String genero);



}
