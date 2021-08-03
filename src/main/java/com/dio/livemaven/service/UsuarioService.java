package com.dio.livemaven.service;

import com.dio.livemaven.model.Usuario;
import com.dio.livemaven.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario create(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    public List<Usuario> listAll(Usuario usuario){
        return usuarioRepository.findAll();
    }
    public Optional<Usuario> getById(Long idUsuario){
        return usuarioRepository.findById(idUsuario);
    }
    public Usuario update(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    public void delete(Long idUsuario){
        usuarioRepository.deleteById(idUsuario);
    }
}
