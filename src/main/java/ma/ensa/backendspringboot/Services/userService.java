package ma.ensa.backendspringboot.Services;
import ma.ensa.backendspringboot.Entities.user;
import ma.ensa.backendspringboot.Repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class userService {
    @Autowired
    private userRepository userepository;

    public user save(user u){
        return userepository.save(u);
    }

    public List<user> findAll(){
        return userepository.findAll();
    }

    public boolean checkCredentials(String email, String password) {
        return userepository.findByEmailAndPassword(email, password).isPresent();
    }

}
