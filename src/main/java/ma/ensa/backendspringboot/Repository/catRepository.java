package ma.ensa.backendspringboot.Repository;

import ma.ensa.backendspringboot.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface catRepository extends JpaRepository<Category,Long>  {


}
