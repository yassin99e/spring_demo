package ma.ensa.backendspringboot.Services;


import ma.ensa.backendspringboot.Entities.Category;
import ma.ensa.backendspringboot.Repository.catRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class categoryService {

    @Autowired
    private catRepository catepository;

    public List<Category> findall(){
        return this.catepository.findAll();
    }

}
