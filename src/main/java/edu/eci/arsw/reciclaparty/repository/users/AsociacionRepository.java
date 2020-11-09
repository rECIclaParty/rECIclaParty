package edu.eci.arsw.reciclaparty.repository.users;

import edu.eci.arsw.reciclaparty.model.users.Asociacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AsociacionRepository extends JpaRepository<Asociacion, UUID> {
}
