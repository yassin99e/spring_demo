package ma.ensa.backendspringboot.Repository;

import ma.ensa.backendspringboot.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface productRepository extends JpaRepository<Product, Long> {
}
