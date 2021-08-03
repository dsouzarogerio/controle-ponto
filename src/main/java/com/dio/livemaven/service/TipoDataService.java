package com.dio.livemaven.service;

import com.dio.livemaven.model.TipoData;
import com.dio.livemaven.repository.TipoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class TipoDataService {

    @Autowired
    TipoDataRepository tipoDataRepository;

    public TipoData create(TipoData tipoData){
        return tipoDataRepository.save(tipoData);
    }
    public List<TipoData> listAll(){
        return tipoDataRepository.findAll();
    }
    public Optional<TipoData> getById(Long idTipoData){
        return tipoDataRepository.findById(idTipoData);
    }
    public TipoData update(TipoData tipoData){
        return tipoDataRepository.save(tipoData);
    }
    public void delete(Long idTipoData){
        tipoDataRepository.deleteById(idTipoData);
    }
}
