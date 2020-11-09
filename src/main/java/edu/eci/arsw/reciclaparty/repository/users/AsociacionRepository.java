package edu.eci.arsw.reciclaparty.repository.users;

import edu.eci.arsw.reciclaparty.model.users.Asociacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AsociacionRepository extends JpaRepository<Asociacion, UUID> {
}
