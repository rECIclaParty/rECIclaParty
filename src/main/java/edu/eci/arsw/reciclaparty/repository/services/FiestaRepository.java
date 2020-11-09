package edu.eci.arsw.reciclaparty.repository.services;

import edu.eci.arsw.reciclaparty.model.services.Fiesta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FiestaRepository extends JpaRepository<Fiesta, UUID> {
}
