/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.storeapp.ffleitas.storeapp.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class Turno implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(targetEntity = Persona.class)
    private Persona persona;
    private Date fechaTurno;
    private Date horaTurno;
    @ManyToOne(targetEntity = Usuario.class)
    private Usuario creadoPor;
    @ManyToOne(targetEntity = Usuario.class)
    private Usuario borradoPor;
    private Date creadoEn;
    private Date borradoEn;
}
