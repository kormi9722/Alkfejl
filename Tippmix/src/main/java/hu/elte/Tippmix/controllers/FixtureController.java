/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hu.elte.Tippmix.controllers;

import hu.elte.Tippmix.entities.Fixture;
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
import hu.elte.Tippmix.repositories.FixtureRepository;

/**
 *
 * @author w10_3
 */
@RestController
@RequestMapping("/fixtures")
public class FixtureController {
    @Autowired
    private FixtureRepository fixtureRepository;
    
    @GetMapping("")
    public ResponseEntity<Iterable<Fixture>> getAll()
    {
        return ResponseEntity.ok(fixtureRepository.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Fixture> get(@PathVariable Integer id)
    {
        Optional<Fixture> team = fixtureRepository.findById(id);
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
    public ResponseEntity<Fixture> post(@PathVariable Fixture fixture)
    {
        Fixture savedFixture=fixtureRepository.save(fixture);
        return ResponseEntity.ok(savedFixture);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Fixture> put(@RequestBody Fixture fixture, @PathVariable Integer id)
    {
        Optional<Fixture> oFixture = fixtureRepository.findById(id);
        if(oFixture.isPresent())
        {
            fixture.setId(id);
            return ResponseEntity.ok(fixtureRepository.save(fixture));
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id)
    {
        Optional<Fixture> oFixture=fixtureRepository.findById(id);
        if(oFixture.isPresent())
        {
            fixtureRepository.deleteById(id);
            return  ResponseEntity.ok().build();
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }
}
