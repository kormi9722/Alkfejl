package hu.elte.Tippmix.repositories;

import hu.elte.Tippmix.entities.Team;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Team, Integer>{

}
