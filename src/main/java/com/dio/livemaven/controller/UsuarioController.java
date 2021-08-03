package com.dio.livemaven.controller;

import com.dio.livemaven.model.Usuario;
import com.dio.livemaven.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "/usuario", produces="application/json")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario){
        return usuarioService.create(usuario);
    }

    @GetMapping
    public List<Usuario> listAll(Usuario usuario){
        return usuarioService.listAll(usuario);
    }

    @GetMapping("/{idUsuario}")
    public ResponseEntity<Usuario> listById(@PathVariable ("idUsuario") Long idUsuario) throws Exception{
        return ResponseEntity.ok(usuarioService.getById(idUsuario).
                orElseThrow(() -> new NoSuchElementException("Not found Id")));
    }

    @PutMapping
    public Usuario updateUsuario(@RequestBody Usuario usuario){

        return usuarioService.update(usuario);
    }

    @DeleteMapping("/{idUsuario}")
    public void deleteUsuario(@PathVariable("idUsuario") Long idUsuario){
        usuarioService.delete(idUsuario);
    }

}
