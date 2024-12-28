package ma.ensa.backendspringboot.web;


import ma.ensa.backendspringboot.Entities.Category;
import ma.ensa.backendspringboot.Services.categoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class categoryController {

    @Autowired
    private categoryService service;

    @GetMapping("/categories")
    public ResponseEntity<List<Category>> findAll() {
        List<Category> categories = service.findall();
        return ResponseEntity.ok().body(categories);
    }


}
