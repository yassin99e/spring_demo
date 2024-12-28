package ma.ensa.backendspringboot.Services;
import jakarta.transaction.Transactional;
import ma.ensa.backendspringboot.Entities.Product;
import ma.ensa.backendspringboot.Repository.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productService {

    @Autowired
    private productRepository productpepository;


    public List<Product> getAllProducts() {
        return productpepository.findAll();
    }


    public boolean saveProduct(Product p) {
        Product save = productpepository.save(p);

        if(save != null) {
            return true;
        }
        else{
            return false;
        }
    }
}
