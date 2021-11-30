/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.storeapp.ffleitas.storeapp.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class PrestacionTurno implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne(targetEntity = Prestacion.class)
    private Prestacion prestacion;
    @OneToOne(targetEntity = Turno.class)
    private Turno turno;

    public PrestacionTurno() {
    }

    public PrestacionTurno(Prestacion prestacion, Turno turno) {
        this.prestacion = prestacion;
        this.turno = turno;
    }
}
