package ma.ensa.backendspringboot.web;
import ma.ensa.backendspringboot.Entities.user;
import ma.ensa.backendspringboot.Services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class userController {

    @Autowired
    private userService service;
    @PostMapping("/register")
    public ResponseEntity<user> save(@RequestBody user u) {
        user savedUser = service.save(u);
        if (savedUser != null) {
            return ResponseEntity.ok(u);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(u);
        }
    }
    @PostMapping("/authenticate")
    public ResponseEntity<user> authenticate(@RequestBody user u) {
        boolean valid = service.checkCredentials(u.getEmail(), u.getPassword());
        if (valid) {
            return ResponseEntity.ok(u);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(u);
        }
    }

}
