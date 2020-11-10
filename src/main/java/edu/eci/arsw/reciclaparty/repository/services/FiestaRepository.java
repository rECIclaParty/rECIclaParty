package edu.eci.arsw.reciclaparty.repository.services;

import edu.eci.arsw.reciclaparty.model.services.Fiesta;
import edu.eci.arsw.reciclaparty.model.services.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface FiestaRepository extends JpaRepository<Fiesta, UUID> {
    @Query(value = "select distinct *, 0 AS clazz_ from fiesta where fiesta.usuario = :id", nativeQuery = true)
    List<Fiesta> findFiestaByIdOnlyOne(@Param("id") UUID id);

    @Query(value = "select distinct *, 0 AS clazz_ from fiesta", nativeQuery = true)
    List<Fiesta> findAllPartysOnlyOne();
}
