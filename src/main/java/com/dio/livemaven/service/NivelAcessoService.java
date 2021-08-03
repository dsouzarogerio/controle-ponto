package com.dio.livemaven.service;

import com.dio.livemaven.model.NivelAcesso;
import com.dio.livemaven.repository.NivelAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelAcessoService {

    @Autowired
    NivelAcessoRepository nivelAcessoRepository;

    public NivelAcesso create(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.save(nivelAcesso);
    }
    public List<NivelAcesso> list(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.findAll();
    }

    public Optional<NivelAcesso> getById(Long idAcesso){
        return nivelAcessoRepository.findById(idAcesso);
    }

    public NivelAcesso update(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.save(nivelAcesso);
    }

    public void delete(Long idAcesso){
        nivelAcessoRepository.deleteById(idAcesso);
    }
}
