package ar.com.storeapp.ffleitas.storeapp.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
public class Prestacion implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombreProducto;
    @OneToMany(mappedBy = "prestacion")
    private PrestacionTurno prestacionTurno;
    private BigDecimal precioUnitario;
    private Integer codigoDeBarras;
}
