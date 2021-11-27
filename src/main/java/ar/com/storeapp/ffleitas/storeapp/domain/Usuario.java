package ar.com.storeapp.ffleitas.storeapp.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class Usuario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer id;
    private String username;
    private Integer creadoPor;
    @Column(nullable = true)
    private Integer borradoPor;
    private Date creadoEn;
    @Column(nullable = true)
    private Date borradoEn;
    private Boolean borradoLogico;

    public Usuario() {
    }

    public Usuario(String username, Integer creadoPor, Integer borradoPor, Date creadoEn, Date borradoEn, Boolean borradoLogico) {
        this.username = username;
        this.creadoPor = creadoPor;
        this.borradoPor = borradoPor;
        this.creadoEn = creadoEn;
        this.borradoEn = borradoEn;
        this.borradoLogico = borradoLogico;
    }

    public Usuario(Integer id, String username, Integer creadoPor, Integer borradoPor, Date creadoEn, Date borradoEn, Boolean borradoLogico) {
        this.id = id;
        this.username = username;
        this.creadoPor = creadoPor;
        this.borradoPor = borradoPor;
        this.creadoEn = creadoEn;
        this.borradoEn = borradoEn;
        this.borradoLogico = borradoLogico;
    }
}
