package com.dio.livemaven.service;

import com.dio.livemaven.model.Empresa;
import com.dio.livemaven.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {

    @Autowired
    EmpresaRepository empresaRepository;

    public Empresa create(Empresa empresa){
        return empresaRepository.save(empresa);
    }
    public List<Empresa> listAll() {
        return empresaRepository.findAll();
    }
    public Optional<Empresa> getById(Long idEmpresa){
        return empresaRepository.findById(idEmpresa);
    }
    public Empresa update(Empresa empresa){
        return empresaRepository.save(empresa);
    }
    public void delete(Long idEmpresa){
        empresaRepository.deleteById(idEmpresa);
    }
}
