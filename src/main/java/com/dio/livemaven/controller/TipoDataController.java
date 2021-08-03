package com.dio.livemaven.controller;

import com.dio.livemaven.model.TipoData;
import com.dio.livemaven.service.TipoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "/tipoData", produces="application/json")
public class TipoDataController {

    @Autowired
    TipoDataService tipoDataService;

    @PostMapping
    public TipoData creataData(@RequestBody TipoData tipoData){
        return tipoDataService.create(tipoData);
    }
    @GetMapping
    public List<TipoData> listAllData(){
        return tipoDataService.listAll();
    }
    @GetMapping("/{idData}")
    public ResponseEntity<TipoData> findByid(@PathVariable("idData") Long idData) throws Exception{
        return ResponseEntity.ok(tipoDataService.getById(idData).
                orElseThrow(() -> new NoSuchElementException("Not found Id")));
    }
    @PutMapping
    public TipoData updateData(TipoData tipoData){
        return tipoDataService.update(tipoData);
    }
    @DeleteMapping("/{idData}")
    public void deleteData(@PathVariable("idData") Long idData){
        tipoDataService.delete(idData);
    }
}
