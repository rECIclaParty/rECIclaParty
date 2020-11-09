package edu.eci.arsw.reciclaparty.repository.users;

import edu.eci.arsw.reciclaparty.model.users.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmpleadoRepository extends JpaRepository<Empleado, UUID> {
}
