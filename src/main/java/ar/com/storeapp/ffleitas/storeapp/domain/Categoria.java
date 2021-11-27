package ar.com.storeapp.ffleitas.storeapp.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
public class Categoria implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer id;
    private String nombreCategoria;
    private Integer creadoPor;
    private Integer borradoPor;
    private Date creadoEn;
    private Date borradoEn;
    private Boolean borradoLogico;
}
