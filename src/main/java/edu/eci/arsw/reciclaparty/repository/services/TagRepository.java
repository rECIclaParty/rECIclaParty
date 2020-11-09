package edu.eci.arsw.reciclaparty.repository.services;

import edu.eci.arsw.reciclaparty.model.services.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TagRepository extends JpaRepository<Tag, UUID> {
}
