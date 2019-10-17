package com.goHealthy.services;

import com.goHealthy.domain.Evento;
import com.goHealthy.repositories.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/* As classes de service servem para fazer o meio termo entre o repository e os controladores
de forma com que os controladores não fiquem poluidos com tratamento de dados, na realidade,
os services são nada mais que classes intermediarias de tratamento de dados.
 */
@Service
public class EventoService {
    @Autowired
    private EventoRepository repository;

    public List<Evento> getAll(){
        return repository.findAll();
    }

    public Evento post(Evento evento) {
        return repository.save(evento);
    }
}
