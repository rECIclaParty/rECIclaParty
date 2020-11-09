package edu.eci.arsw.reciclaparty.repository.services;

import edu.eci.arsw.reciclaparty.model.services.Publicacion;
import edu.eci.arsw.reciclaparty.model.users.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PublicacionRepository extends JpaRepository<Publicacion, UUID> {
    @Query(value = "select distinct *, 0 AS clazz_ from publicacion", nativeQuery = true)
    List<User> findAllOnlyOne();

    @Query(value = "select distinct *, 0 AS clazz_ from publicacion where usuario.id = :id", nativeQuery = true)
    Optional<User> findByIdOnlyOne(@Param("id") UUID id);
}
