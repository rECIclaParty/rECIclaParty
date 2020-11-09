package edu.eci.arsw.reciclaparty.repository.services;

import edu.eci.arsw.reciclaparty.model.services.PublicacionXTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PublicacionXTagRepository extends JpaRepository<PublicacionXTag, UUID> {
}
