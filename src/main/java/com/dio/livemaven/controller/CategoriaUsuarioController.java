package com.dio.livemaven.controller;


import com.dio.livemaven.model.CategoriaUsuario;
import com.dio.livemaven.service.CategoriaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "/categoria", produces="application/json")
public class CategoriaUsuarioController {

    @Autowired
    CategoriaUsuarioService categoriaUsuarioService;

    @PostMapping
    public CategoriaUsuario createCategoria(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.saveCategoria(categoriaUsuario);
    }

    @GetMapping
    public List<CategoriaUsuario> listCategoria(CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.listarCategoria();
    }

    @GetMapping("/{idCategoria}")
    public ResponseEntity<CategoriaUsuario> buscarId(@PathVariable("idCategoria") Long idCategoria) throws Exception{
        return ResponseEntity.ok(categoriaUsuarioService.buscarId(idCategoria)
                .orElseThrow(() -> new NoSuchElementException("Not found Id")));
    }

    @PutMapping
    public CategoriaUsuario updateCategoria(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.updateCategoria(categoriaUsuario);
    }

    @DeleteMapping("/{idCategoria}")
    public void deleteCategoria(@PathVariable("idCategoria") Long idCategoria){
        categoriaUsuarioService.deleteCategoriaId(idCategoria);
    }



}
