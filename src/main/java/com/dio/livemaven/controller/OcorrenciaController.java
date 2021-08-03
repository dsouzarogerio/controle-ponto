package com.dio.livemaven.controller;

import com.dio.livemaven.model.Ocorrencia;
import com.dio.livemaven.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "/ocorrencia", produces="application/json")
public class OcorrenciaController {

    @Autowired
    OcorrenciaService ocorrenciaService;

    @PostMapping
    public Ocorrencia createOcorrencia(@RequestBody Ocorrencia ocorrencia){
        return ocorrenciaService.create(ocorrencia);
    }

    @GetMapping
    public List<Ocorrencia> listAll(){
        return ocorrenciaService.listAll();
    }

    @GetMapping("/{idOcorrencia}")
    public ResponseEntity<Ocorrencia> findById(@PathVariable("idOcorrencia") Long idOcorrencia) throws Exception{
        return ResponseEntity.ok(ocorrenciaService.getById(idOcorrencia).
                orElseThrow(()-> new NoSuchElementException("Not found Id")));
    }

    @PutMapping
    public Ocorrencia update(@RequestBody Ocorrencia ocorrencia){
        return ocorrenciaService.update(ocorrencia);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        ocorrenciaService.delete(id);
    }
}