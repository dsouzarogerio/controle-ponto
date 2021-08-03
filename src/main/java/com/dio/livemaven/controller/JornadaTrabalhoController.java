package com.dio.livemaven.controller;

import com.dio.livemaven.model.JornadaTrabalho;
import com.dio.livemaven.service.JornadaTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Implementa os métodos HTTP
 */
@RestController
@RequestMapping(value = "/jornada", produces="application/json")
public class JornadaTrabalhoController {

    @Autowired
    JornadaTrabalhoService jornadaTrabalhoService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoService.save(jornadaTrabalho);
    }

    @GetMapping
    public List <JornadaTrabalho> getJornadaList(){
        return jornadaTrabalhoService.findAll();
    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(jornadaTrabalhoService.getById(idJornada).
                orElseThrow(()-> new NoSuchElementException("Not found Id")));
    }

    @PutMapping
    public JornadaTrabalho update(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoService.update(jornadaTrabalho);
    }

    @DeleteMapping("/{idJornada}")
    public void deletarJornada(@PathVariable("idJornada") Long idJornada){
        jornadaTrabalhoService.deleteJornada(idJornada);
    }

}
