package edu.escuelaing.arsw.rECIclaParty.models.users.Repositories;

import edu.escuelaing.arsw.rECIclaParty.models.users.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository <Cliente,String>{

}
