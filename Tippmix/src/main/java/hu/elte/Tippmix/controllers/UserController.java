/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hu.elte.Tippmix.controllers;

import hu.elte.Tippmix.entities.User;
import hu.elte.Tippmix.repositories.UserRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author w10_3
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private BCryptPasswordEncoder passwordencoder;
    
    @Autowired
    private UserRepository userRepository;
    
    @PostMapping("register")
    public ResponseEntity<User> register(@RequestBody User user)
    {
        Optional<User> oUser=userRepository.findByName(user.getUsername());
        if(oUser.isPresent())
        {
            return ResponseEntity.badRequest().build();
        }
//        user.setPassword(pass)
        return null;
    }
}
