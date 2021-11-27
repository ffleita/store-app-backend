package ar.com.storeapp.ffleitas.storeapp.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer id;
    private String nombreProducto;
    @ManyToOne(targetEntity = Categoria.class)
    private Categoria categoria;
    private BigDecimal precioUnitario;
    private Integer codigoDeBarras;
    private Boolean borradoLogico;
}
