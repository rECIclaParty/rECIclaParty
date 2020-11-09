package edu.eci.arsw.reciclaparty.repository.users;

import edu.eci.arsw.reciclaparty.model.users.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    @Query(value = "select u from only usuario u")
    List<User> findAllOnlyOne();

    @Query(value = "select u from only usuario u where u.id = ?1")
    Optional<User> findByIdOnlyOne(UUID uuid);
}
