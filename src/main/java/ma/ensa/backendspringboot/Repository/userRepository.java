package ma.ensa.backendspringboot.Repository;

import ma.ensa.backendspringboot.Entities.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface userRepository extends JpaRepository<user, Long> {


    Optional<user> findByEmailAndPassword(String email, String password);

}
