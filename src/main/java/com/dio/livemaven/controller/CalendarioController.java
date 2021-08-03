package com.dio.livemaven.controller;

import com.dio.livemaven.model.Calendario;
import com.dio.livemaven.service.CalendarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "/calendario", produces="application/json")
public class CalendarioController {

    @Autowired
    CalendarioService calendarioService;

    @PostMapping
    public Calendario create(@RequestBody Calendario calendario){
        return calendarioService.create(calendario);
    }

    @GetMapping
    public List<Calendario> listAll(){
        return calendarioService.listAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Calendario> getById(@PathVariable("id") Long id) throws Exception{
        return ResponseEntity.ok(calendarioService.getById(id).
                orElseThrow(() -> new NoSuchElementException("Not found Id")));
    }

    @PutMapping
    public Calendario update(@RequestBody Calendario calendario){
        return calendarioService.update(calendario);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        calendarioService.delete(id);
    }

}
