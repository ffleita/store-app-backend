package ar.com.storeapp.ffleitas.storeapp.repository;

import ar.com.storeapp.ffleitas.storeapp.domain.Prestacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestacionRepository extends JpaRepository<Prestacion, Integer> {
    
}
