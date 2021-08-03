package com.dio.livemaven.service;

import com.dio.livemaven.model.Ocorrencia;
import com.dio.livemaven.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OcorrenciaService {

    @Autowired
    OcorrenciaRepository ocorrenciaRepository;

    public Ocorrencia create(Ocorrencia ocorrencia){
        return ocorrenciaRepository.save(ocorrencia);
    }

    public List<Ocorrencia> listAll(){
        return ocorrenciaRepository.findAll();
    }

    public Optional<Ocorrencia> getById(Long idOcorrencia){
        return ocorrenciaRepository.findById(idOcorrencia);
    }

    public Ocorrencia update(Ocorrencia ocorrencia){
        return ocorrenciaRepository.save(ocorrencia);
    }

    public void delete(Long idOcorrencia){
        ocorrenciaRepository.deleteById(idOcorrencia);
    }
}
