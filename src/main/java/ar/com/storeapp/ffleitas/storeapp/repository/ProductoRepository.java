package ar.com.storeapp.ffleitas.storeapp.repository;

import ar.com.storeapp.ffleitas.storeapp.domain.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepository extends CrudRepository<Producto, Integer> {
    
}
