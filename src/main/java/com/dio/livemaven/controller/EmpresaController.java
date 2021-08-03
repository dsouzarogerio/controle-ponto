package com.dio.livemaven.controller;

import com.dio.livemaven.model.Empresa;
import com.dio.livemaven.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "/empresa", produces="application/json")
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    @PostMapping
    public Empresa createEmpresa(@RequestBody Empresa empresa){
        return empresaService.create(empresa);
    }

    @GetMapping
    public List<Empresa> findAllEmpresa(){
        return empresaService.listAll();
    }

    @GetMapping("/{idEmpresa}")
    public ResponseEntity<Empresa> findById(@PathVariable("idEmpresa") Long idEmpresa) throws Exception{
        return ResponseEntity.ok(empresaService.getById(idEmpresa).
                orElseThrow(() -> new NoSuchElementException("Not found id")));
    }
    @PutMapping
    public Empresa updateEmpresa(@RequestBody Empresa empresa){
        return empresaService.update(empresa);
    }
    @DeleteMapping("/{idEmpresa}")
    public void deleteEmpresa(@PathVariable("idEmpresa") Long idEmpresa){
        empresaService.delete(idEmpresa);
    }
}
