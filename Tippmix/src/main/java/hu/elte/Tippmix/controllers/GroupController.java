package hu.elte.Tippmix.controllers;

import hu.elte.Tippmix.entities.Group;
import hu.elte.Tippmix.repositories.GroupRepository;
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
@RequestMapping("/groups")
public class GroupController {
    @Autowired
    private GroupRepository groupRepository;
    
    @GetMapping("")
    public ResponseEntity<Iterable<Group>> getAll()
    {
        return ResponseEntity.ok(groupRepository.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Group> get(@PathVariable Integer id)
    {
        Optional<Group> group = groupRepository.findById(id);
        if(group.isPresent())
        {
            return ResponseEntity.ok(group.get());
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping("")
    public ResponseEntity<Group> post(@PathVariable Group group)
    {
        Group savedGroup = groupRepository.save(group);
        return ResponseEntity.ok(savedGroup);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Group> put(@RequestBody Group group, @PathVariable Integer id)
    {
        Optional<Group> oGroup = groupRepository.findById(id);
        if(oGroup.isPresent())
        {;
            return ResponseEntity.ok(groupRepository.save(group));
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id)
    {
        Optional<Group> oGroup = groupRepository.findById(id);
        if(oGroup.isPresent())
        {
            groupRepository.deleteById(id);
            return  ResponseEntity.ok().build();
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }
}
