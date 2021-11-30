package ar.com.storeapp.ffleitas.storeapp.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
public class Plan implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombrePlan;
    @ManyToOne(targetEntity = ObraSocial.class)
    private ObraSocial obraSocial;
    @OneToOne(mappedBy = "plan")
    private Plan plan;
}
