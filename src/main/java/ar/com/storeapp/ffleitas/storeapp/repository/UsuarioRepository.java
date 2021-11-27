package ar.com.storeapp.ffleitas.storeapp.repository;

import ar.com.storeapp.ffleitas.storeapp.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    
    public Usuario findByUsername(String username);
}
