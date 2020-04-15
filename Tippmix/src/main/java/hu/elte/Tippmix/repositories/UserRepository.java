/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.elte.Tippmix.repositories;

import hu.elte.Tippmix.entities.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author w10_3
 */
public interface UserRepository extends CrudRepository<User, Integer>{
    Optional<User> findByName(String username);
}
