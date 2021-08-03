package com.dio.livemaven.controller;

import com.dio.livemaven.model.NivelAcesso;
import com.dio.livemaven.service.NivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "/acesso", produces="application/json")
public class NivelAcessoController {

    @Autowired
    NivelAcessoService nivelAcessoService;

    @PostMapping
    public NivelAcesso createAcesso(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.create(nivelAcesso);
    }

    @GetMapping
    public List<NivelAcesso> listAcesso(NivelAcesso nivelAcesso){
        return nivelAcessoService.list(nivelAcesso);
    }

    @GetMapping("/{idAcesso}")
    public ResponseEntity<NivelAcesso> getByIdAcesso(@PathVariable("idAcesso") Long idAcesso) throws Exception{
        return ResponseEntity.ok(nivelAcessoService.getById(idAcesso).
                orElseThrow(() -> new NoSuchElementException("Not found Id")));
    }

    @PutMapping
    public NivelAcesso updateAcesso(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.update(nivelAcesso);
    }

    @DeleteMapping("/{idAcesso}")
    public void deleteAcesso(@PathVariable("idUsuario") Long idAcesso){

        nivelAcessoService.delete(idAcesso);
    }
}
