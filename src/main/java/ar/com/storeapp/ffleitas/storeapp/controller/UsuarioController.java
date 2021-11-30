package ar.com.storeapp.ffleitas.storeapp.controller;

import ar.com.storeapp.ffleitas.storeapp.domain.Usuario;
import ar.com.storeapp.ffleitas.storeapp.repository.UsuarioRepository;
import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
public class UsuarioController {
    
    private UsuarioRepository repo;
    
    @Autowired
    public UsuarioController(UsuarioRepository repo) {
        this.repo = repo;
    }
    
    @GetMapping("/usuarios")
    public List<Usuario> getAllUsuarios() {
        return repo.findAll();
    }
    
    @PostMapping("/usuarios/")
    public ResponseEntity createUsuario(@RequestBody Usuario usuario) {
        
        var usuarioEnBd = repo.findByUsername(usuario.getUsername());
        if (usuarioEnBd != null)
            throw new RuntimeException("El usuario que está intentando crear ya existe.");
        
        Usuario savedUser = repo.save(usuario);
        URI location = URI.create("/crear/" + savedUser.getId());
        return ResponseEntity.created(location).build();
    }
    
    @DeleteMapping("/suarios/{id}")
    public ResponseEntity deleteUsuario(@PathVariable Integer id) {
        var optUsuario = repo.findById(id);
        
        if (optUsuario == null)
            return new ResponseEntity("No hemos encontrado el usuario que intenta borrar.", HttpStatus.NOT_FOUND);
        
        var usuario = optUsuario.get();
        repo.delete(usuario);
        return new ResponseEntity("El usuario" + usuario.getUsername() + " ha sido borrado con exito", HttpStatus.OK);
    }
}
