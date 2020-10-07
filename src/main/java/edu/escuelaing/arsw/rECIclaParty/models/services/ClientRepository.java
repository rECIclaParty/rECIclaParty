package edu.escuelaing.arsw.rECIclaParty.models.services;

import edu.escuelaing.arsw.rECIclaParty.models.users.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository <Cliente,String>{

}
