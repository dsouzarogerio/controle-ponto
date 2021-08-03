package com.dio.livemaven.controller;

import com.dio.livemaven.model.Localidade;
import com.dio.livemaven.service.LocalidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "/localidade", produces="application/json")
public class LocalidadeController {

    @Autowired
    LocalidadeService localidadeService;

    @PostMapping
    public Localidade createLocalidade(@RequestBody Localidade localidade){
        return localidadeService.create(localidade);
    }
    @GetMapping
    public List<Localidade> listLocalidade(){
        return localidadeService.listAll();
    }

    @GetMapping("/{idLocalidade}")
    public ResponseEntity<Localidade> getIdLocalidade(@PathVariable("idLocalidade") Long idLocalidade) throws Exception{
        return ResponseEntity.ok(localidadeService.getById(idLocalidade).
                orElseThrow(() -> new NoSuchElementException("Not found Id")));
    }
    @PutMapping
    public Localidade updateLocalidade(@RequestBody Localidade localidade){
        return localidadeService.update(localidade);
    }
    @DeleteMapping("/{idLocalidade}")
    public void deleteLocalidade(@PathVariable("idLocalidade") Long idLocalidade){
        localidadeService.delete(idLocalidade);
    }
}