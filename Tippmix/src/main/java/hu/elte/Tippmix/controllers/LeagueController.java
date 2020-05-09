package hu.elte.Tippmix.controllers;

import hu.elte.Tippmix.entities.League;
import hu.elte.Tippmix.repositories.LeagueRepository;
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
@RequestMapping("/leagues")
public class LeagueController {
    @Autowired
    private LeagueRepository leagueRepository;
    
    @GetMapping("")
    public ResponseEntity<Iterable<League>> getAll()
    {
        return ResponseEntity.ok(leagueRepository.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<League> get(@PathVariable Integer id)
    {
        Optional<League> league = leagueRepository.findById(id);
        if(league.isPresent())
        {
            return ResponseEntity.ok(league.get());
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping("")
    public ResponseEntity<League> post(@PathVariable League league)
    {
        League savedLeague = leagueRepository.save(league);
        return ResponseEntity.ok(savedLeague);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<League> put(@RequestBody League league, @PathVariable Integer id)
    {
        Optional<League> oLeague = leagueRepository.findById(id);
        if(oLeague.isPresent())
        {;
            return ResponseEntity.ok(leagueRepository.save(league));
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id)
    {
        Optional<League> oLeague = leagueRepository.findById(id);
        if(oLeague.isPresent())
        {
            leagueRepository.deleteById(id);
            return  ResponseEntity.ok().build();
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }
}
