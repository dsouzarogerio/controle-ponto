package com.dio.livemaven.service;

import com.dio.livemaven.model.BancoHoras;
import com.dio.livemaven.repository.BancoHorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancoHorasService {

    @Autowired
    BancoHorasRepository bancoHorasRepository;

    public BancoHoras create(BancoHoras bancoHoras){
        return bancoHorasRepository.save(bancoHoras);
    }

    public List<BancoHoras> listAll(){
        return bancoHorasRepository.findAll();
    }

    public Optional<BancoHoras> getById(Long id){
        return bancoHorasRepository.findById(id);
    }

    public BancoHoras update(BancoHoras bancoHoras){
        return bancoHorasRepository.save(bancoHoras);
    }

    public void delete(Long id){
        bancoHorasRepository.deleteById(id);
    }
}
