package ar.com.storeapp.ffleitas.storeapp.controller;

import ar.com.storeapp.ffleitas.storeapp.domain.Usuario;
import ar.com.storeapp.ffleitas.storeapp.exception.UserAlreadyCreatedException;
import ar.com.storeapp.ffleitas.storeapp.repository.UsuarioRepository;
import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
public class UsuarioController {
    
    private UsuarioRepository repository;
    
    @Autowired
    public UsuarioController(UsuarioRepository repository) {
        this.repository = repository;
    }
    
    @GetMapping("/usuarios")
    public List<Usuario> getAllUsuarios() {
        return repository.findAll();
    }
    
    @PostMapping("/usuarios/crear")
    public ResponseEntity createUsuario(@RequestBody Usuario usuario) {
        
        var usuarioEnBd = repository.findByUsername(usuario.getUsername());
        if (usuarioEnBd != null)
            throw new RuntimeException("El usuario que está intentando crear ya existe.");
        
        Usuario savedUser = repository.save(usuario);
        URI location = URI.create("/crear/" + savedUser.getId());
        return ResponseEntity.created(location).build();
    }
}
