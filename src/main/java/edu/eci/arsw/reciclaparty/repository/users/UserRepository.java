package edu.eci.arsw.reciclaparty.repository.users;

import edu.eci.arsw.reciclaparty.model.users.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    @Query(value = "select distinct *, 0 AS clazz_ from usuario", nativeQuery = true)
    List<User> findAllOnlyOne();

    @Query(value = "select distinct *, 0 AS clazz_ from usuario where usuario.id = :id", nativeQuery = true)
    Optional<User> findByIdOnlyOne(@Param("id") UUID id);

    @Query(value = "select *, 0 AS clazz_ from only usuario", nativeQuery = true)
    List<User> findOnlyInUser();

    @Query(value = "select *, 0 AS clazz_ from only usuario where usuario.id = :id", nativeQuery = true)
    Optional<User> findOnlyInUserById(@Param("id") UUID id);

}
