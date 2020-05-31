package hu.elte.Tippmix.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

public class Ticket{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToOne
    @JoinColumn
    private Fixture fixture;
    
    @ManyToOne
    @JoinColumn
    private User user;
    
    @Column(name = "BET")
    @NotNull
    private String bet;
   
}
