package hu.elte.Tippmix.controllers;

import hu.elte.Tippmix.entities.User;
import hu.elte.Tippmix.repositories.UserRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("")
    public ResponseEntity<Iterable<User>> getAll()
    {
        return ResponseEntity.ok(userRepository.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<User> get(@PathVariable Integer id)
    {
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent())
        {
            return ResponseEntity.ok(user.get());
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping("")
    public ResponseEntity<User> post(@PathVariable User user)
    {
        User savedUser = userRepository.save(user);
        return ResponseEntity.ok(savedUser);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<User> put(@RequestBody User user, @PathVariable Integer id)
    {
        Optional<User> oUser = userRepository.findById(id);
        if(oUser.isPresent())
        {
            user.setId(id);
            return ResponseEntity.ok(userRepository.save(user));
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id)
    {
        Optional<User> oUser=userRepository.findById(id);
        if(oUser.isPresent())
        {
            userRepository.deleteById(id);
            return  ResponseEntity.ok().build();
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }
}
