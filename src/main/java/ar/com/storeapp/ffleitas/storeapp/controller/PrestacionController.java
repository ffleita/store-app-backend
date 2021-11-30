package ar.com.storeapp.ffleitas.storeapp.controller;

import ar.com.storeapp.ffleitas.storeapp.domain.Prestacion;
import ar.com.storeapp.ffleitas.storeapp.exception.DataNotFoundException;
import ar.com.storeapp.ffleitas.storeapp.repository.PrestacionRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PrestacionController {
 
    private PrestacionRepository repository;
    
    @Autowired
    public PrestacionController(PrestacionRepository repository) {
        this.repository = repository;
    }
    
    @GetMapping("/productos/")
    public List<Prestacion> getTodosLosProductos() {
        var prestacionesIterator = repository.findAll();
        var prestacionesList = new ArrayList<Prestacion>();
        
        if (prestacionesList.size() == 0)
            throw new DataNotFoundException("No se han encontrado prestaciones.");
        
        return prestacionesList;
    }
}
