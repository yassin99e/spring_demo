package ma.ensa.backendspringboot.web;
import ma.ensa.backendspringboot.Entities.Product;
import ma.ensa.backendspringboot.Services.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/home")
public class productController {

    @Autowired
    private productService service;


    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok().body(service.getAllProducts());
    }



    @PostMapping("/addProduct")
    public ResponseEntity<Product> saveProduct(@RequestBody Product pr) {
        boolean test = service.saveProduct(pr);
        if (test) {
            return ResponseEntity.ok(pr);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(pr);
        }
    }

}
