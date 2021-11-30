package ar.com.storeapp.ffleitas.storeapp.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
public class PersonaPlan implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne(targetEntity = Persona.class)
    private Persona persona;
    @OneToOne(targetEntity = Plan.class)
    private Plan plan;
}
