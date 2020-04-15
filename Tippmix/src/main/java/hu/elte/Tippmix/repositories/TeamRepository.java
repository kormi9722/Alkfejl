/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.elte.Tippmix.repositories;

import hu.elte.Tippmix.entities.Team;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Integer>{
    Optional<Team> findByName(String name);
}
