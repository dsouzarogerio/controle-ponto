package com.dio.livemaven.service;

import com.dio.livemaven.model.Localidade;
import com.dio.livemaven.repository.LocalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalidadeService {

    @Autowired
    LocalidadeRepository localidadeRepository;

    public Localidade create(Localidade localidade){
        return localidadeRepository.save(localidade);
    }

    public List<Localidade> listAll(){
        return localidadeRepository.findAll();
    }

    public Optional<Localidade> getById(Long idLocalidade){
        return localidadeRepository.findById(idLocalidade);
    }

    public Localidade update(Localidade localidade){
        return localidadeRepository.save(localidade);
    }

    public void delete(Long idLocalidade){
        localidadeRepository.deleteById(idLocalidade);
    }
}