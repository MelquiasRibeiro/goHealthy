package com.goHealthy.services;

import com.goHealthy.domain.Aspirante;
import com.goHealthy.repositories.AspiranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AspiranteService {

    @Autowired
    AspiranteRepository aspiranteRepository;

    public Optional<Aspirante> find(Integer id){
        return aspiranteRepository.findById(id);
    }
}
