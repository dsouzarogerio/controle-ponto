package com.dio.livemaven.service;

import com.dio.livemaven.model.JornadaTrabalho;
import com.dio.livemaven.repository.JornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Implementa os métodos de negócio
 */
@Service
public class JornadaTrabalhoService {

    @Autowired // -> anotação para inicializar dependências
    JornadaTrabalhoRepository jornadaTrabalhoRepository;

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {

        return jornadaTrabalhoRepository.findAll();
    }

    public Optional<JornadaTrabalho> getById(Long idJornada) {
        return jornadaTrabalhoRepository.findById(idJornada);
    }

    public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public void deleteJornada(Long idJornada) {
        jornadaTrabalhoRepository.deleteById(idJornada);
    }
}
