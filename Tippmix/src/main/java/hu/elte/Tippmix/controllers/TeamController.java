/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hu.elte.Tippmix.controllers;

import hu.elte.Tippmix.entities.Team;
import hu.elte.Tippmix.repositories.TeamRepository;
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

/**
 *
 * @author w10_3
 */
@RestController
@RequestMapping("/teams")
public class TeamController {
    @Autowired
    private TeamRepository teamRepository;
    
    @GetMapping("")
    public ResponseEntity<Iterable<Team>> getAll()
    {
        return ResponseEntity.ok(teamRepository.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Team> get(@PathVariable Integer id)
    {
        Optional<Team> team = teamRepository.findById(id);
        if(team.isPresent())
        {
            return ResponseEntity.ok(team.get());
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping("")
    public ResponseEntity<Team> post(@PathVariable Team team)
    {
        Team savedTeam=teamRepository.save(team);
        return ResponseEntity.ok(savedTeam);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Team> put(@RequestBody Team team, @PathVariable Integer id)
    {
        Optional<Team> oTeam = teamRepository.findById(id);
        if(oTeam.isPresent())
        {
            team.setId(id);
            return ResponseEntity.ok(teamRepository.save(team));
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id)
    {
        Optional<Team> oTeam=teamRepository.findById(id);
        if(oTeam.isPresent())
        {
            teamRepository.deleteById(id);
            return  ResponseEntity.ok().build();
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }
}
