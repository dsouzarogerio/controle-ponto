package com.dio.livemaven.service;

import com.dio.livemaven.model.Movimentacao;
import com.dio.livemaven.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentacaoService {

    @Autowired
    MovimentacaoRepository movimentacaoRepository;

    public Movimentacao create(Movimentacao movimentacao){
        return movimentacaoRepository.save(movimentacao);
    }

    public List<Movimentacao> listAll(){
        return movimentacaoRepository.findAll();
    }

    public Optional<Movimentacao> getById(Long id){
        return movimentacaoRepository.findById(id);
    }

    public Movimentacao update(Movimentacao movimentacao){
        return movimentacaoRepository.save(movimentacao);
    }

    public void delete(Long id){
        movimentacaoRepository.deleteById(id);
    }
}
