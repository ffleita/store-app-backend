package ar.com.storeapp.ffleitas.storeapp.controller;

import ar.com.storeapp.ffleitas.storeapp.domain.Producto;
import ar.com.storeapp.ffleitas.storeapp.repository.ProductoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductoController {
 
    private ProductoRepository repository;
    
    @Autowired
    public ProductoController(ProductoRepository repository) {
        this.repository = repository;
    }
    
    @GetMapping("/productos/")
    public List<Producto> getTodosLosProductos() {
        var productosIterator = repository.findAll().iterator();
        var productosList = new ArrayList<Producto>();
        while(productosIterator.hasNext())
            productosList.add((Producto) productosIterator.next());
        return productosList;
    }
}
