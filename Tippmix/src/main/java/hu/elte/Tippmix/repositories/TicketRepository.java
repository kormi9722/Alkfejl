package hu.elte.Tippmix.repositories;

import hu.elte.Tippmix.entities.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Integer>{

}
