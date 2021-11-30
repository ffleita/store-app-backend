package ar.com.storeapp.ffleitas.storeapp.repository;

import ar.com.storeapp.ffleitas.storeapp.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {
    
}
