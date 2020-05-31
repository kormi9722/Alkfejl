package hu.elte.Tippmix.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Data;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

public class Fixture {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "home")
    @NotNull
    private String home;
    
    @Column(name="guest")
    @NotNull
    private String guest;
    
    @Column(name="result")
    @NotNull
    private String result;
    
    @OneToMany(mappedBy = "fixture")
    @JsonIgnore
    private List<Ticket> tickets;
}
