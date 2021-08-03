package com.dio.livemaven.controller;

import com.dio.livemaven.model.Movimentacao;
import com.dio.livemaven.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "/movimentacao", produces="application/json")
public class MovimentacaoController {

    @Autowired
    MovimentacaoService movimentacaoService;

    @PostMapping
    public Movimentacao create(@RequestBody Movimentacao movimentacao){
        return movimentacaoService.create(movimentacao);
    }

    @GetMapping
    public List<Movimentacao> listAll(){
        return movimentacaoService.listAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movimentacao> getById(@PathVariable ("id") Long id) throws Exception{
        return ResponseEntity.ok(movimentacaoService.getById(id).
                orElseThrow(() -> new NoSuchElementException("Not found Id")));
    }

    @PutMapping
    public Movimentacao update(@RequestBody Movimentacao movimentacao){
        return movimentacaoService.update(movimentacao);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id){
        movimentacaoService.delete(id);
    }
}
