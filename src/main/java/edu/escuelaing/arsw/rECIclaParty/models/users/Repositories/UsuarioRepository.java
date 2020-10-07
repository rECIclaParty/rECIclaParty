package edu.escuelaing.arsw.rECIclaParty.models.users.Repositories;

import edu.escuelaing.arsw.rECIclaParty.models.users.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,Integer> {

    List<Usuario> getByCorreo(String correo);

    List<Usuario> getByGenero(String genero);



}
