package edu.eci.arsw.reciclaparty.repository.services;

import edu.eci.arsw.reciclaparty.model.services.Oferta;
import edu.eci.arsw.reciclaparty.model.services.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface OfertaRepository extends JpaRepository<Oferta, UUID> {

    @Query(value = "select distinct *, 0 AS clazz_ from oferta where oferta.empleado = :employeeId", nativeQuery = true)
    List<Oferta> findOfertasByEmployeeId(@Param("employeeId") UUID employeeId);

    @Query(value = "select distinct *, 0 AS clazz_ from oferta where oferta.publicacion = :publicationId", nativeQuery = true)
    List<Oferta> findOfertasByPublicationId(@Param("publicationId") UUID publicationId);

    @Query(value = "select distinct puntos, 0 AS clazz_ from oferta where oferta.id = :ofertaId", nativeQuery = true)
    int findPointsByOferta(@Param("ofertaId") UUID ofertaId);
}
