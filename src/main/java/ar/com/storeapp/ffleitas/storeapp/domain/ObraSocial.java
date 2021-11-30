package ar.com.storeapp.ffleitas.storeapp.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
public class ObraSocial implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String obraSocialNombre;
    @OneToMany(mappedBy = "obraSocial", fetch = FetchType.LAZY)
    private Plan plan;
}
