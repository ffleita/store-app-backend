package ar.com.storeapp.ffleitas.storeapp.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
public class Persona implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer nroDocumento;
    private String domicilio;
    private Integer telefono;
    private String email;
    @OneToOne(mappedBy = "persona")
    private PersonaPlan plan;
    @OneToMany(targetEntity = Usuario.class)
    private Usuario creadoPor;
    @OneToMany(targetEntity = Usuario.class)
    private Usuario borradoPor;
    private Date creadoEn;
    private Date borradoEn;
}
