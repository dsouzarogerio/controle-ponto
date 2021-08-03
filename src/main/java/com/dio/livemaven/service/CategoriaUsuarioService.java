package com.dio.livemaven.service;

import com.dio.livemaven.model.CategoriaUsuario;
import com.dio.livemaven.repository.CategoriaUsuarioRepository;
import org.hibernate.validator.constraints.time.DurationMax;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaUsuarioService {

    @Autowired
    CategoriaUsuarioRepository categoriaUsuarioRepository;

    public CategoriaUsuario saveCategoria(CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }

    public List<CategoriaUsuario> listarCategoria() {
        return categoriaUsuarioRepository.findAll();
    }
    public Optional<CategoriaUsuario> buscarId(Long idCategoria){
        return categoriaUsuarioRepository.findById(idCategoria);
    }

    public CategoriaUsuario updateCategoria(CategoriaUsuario categoriaUsuario) {
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }

    public void deleteCategoriaId(Long idCategoria){
        categoriaUsuarioRepository.deleteById(idCategoria);
    }
}
