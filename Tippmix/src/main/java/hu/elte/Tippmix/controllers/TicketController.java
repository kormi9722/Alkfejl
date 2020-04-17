package hu.elte.Tippmix.controllers;

import hu.elte.Tippmix.entities.Ticket;
import hu.elte.Tippmix.repositories.TicketRepository;
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
@RequestMapping("/tickets")
public class TicketController {
    @Autowired
    private TicketRepository ticketRepository;
    
    @GetMapping("")
    public ResponseEntity<Iterable<Ticket>> getAll()
    {
        return ResponseEntity.ok(ticketRepository.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Ticket> get(@PathVariable Integer id)
    {
        Optional<Ticket> ticket = ticketRepository.findById(id);
        if(ticket.isPresent())
        {
            return ResponseEntity.ok(ticket.get());
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping("")
    public ResponseEntity<Ticket> post(@PathVariable Ticket ticket)
    {
        Ticket savedTicket = ticketRepository.save(ticket);
        return ResponseEntity.ok(savedTicket);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Ticket> put(@RequestBody Ticket ticket, @PathVariable Integer id)
    {
        Optional<Ticket> oTicket = ticketRepository.findById(id);
        if(oTicket.isPresent())
        {
            ticket.setId(id);
            return ResponseEntity.ok(ticketRepository.save(ticket));
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id)
    {
        Optional<Ticket> oTicket = ticketRepository.findById(id);
        if(oTicket.isPresent())
        {
            ticketRepository.deleteById(id);
            return  ResponseEntity.ok().build();
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }
}
