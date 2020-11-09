package edu.eci.arsw.reciclaparty.repository.services;

import edu.eci.arsw.reciclaparty.model.services.Objeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ObjetoRepository extends JpaRepository<Objeto,Long> {
}
