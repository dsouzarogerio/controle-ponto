package com.dio.livemaven.controller;

import com.dio.livemaven.model.BancoHoras;
import com.dio.livemaven.service.BancoHorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "/bancohoras", produces="application/json")
public class BancoHorasController {

    @Autowired
    BancoHorasService bancoHorasService;

    @PostMapping
    public BancoHoras createBanco(@RequestBody BancoHoras bancoHoras){
        return bancoHorasService.create(bancoHoras);
    }

    @GetMapping
    public List<BancoHoras> listAll(){
        return bancoHorasService.listAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BancoHoras> findById(@PathVariable ("id") Long id) throws Exception{
        return ResponseEntity.ok(bancoHorasService.getById(id).
                orElseThrow(() -> new NoSuchElementException("Not found id")));
    }

    @PutMapping
    public BancoHoras updateBanco(@RequestBody BancoHoras bancoHoras){
        return bancoHorasService.update(bancoHoras);
    }

    @DeleteMapping("/{id}")
    public void deleteBanco(@PathVariable ("id") Long id){
        bancoHorasService.delete(id);
    }

}
