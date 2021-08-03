package com.dio.livemaven.service;

import com.dio.livemaven.model.Calendario;
import com.dio.livemaven.repository.CalendarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalendarioService {

    @Autowired
    CalendarioRepository calendarioRepository;

    public Calendario create(Calendario calendario){
        return calendarioRepository.save(calendario);
    }

    public List<Calendario> listAll(){
        return calendarioRepository.findAll();
    }

    public Optional<Calendario> getById(Long id){
        return calendarioRepository.findById(id);
    }

    public Calendario update(Calendario calendario){
        return calendarioRepository.save(calendario);
    }

    public void delete(Long id){
        calendarioRepository.deleteById(id);
    }
}