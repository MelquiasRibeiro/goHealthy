package com.goHealthy.services;

import com.goHealthy.domain.Evento;
import com.goHealthy.repositories.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void deleteByObject(Evento evento){
        repository.deleteById(evento.getId());
    }

    public void deleteById(Integer id){
        repository.deleteById(id);
    }

    //Need work
    public Evento put(Evento evento){
        //Pass the informations than can be updated in the object.
        Optional<Evento> infoToUpdate=find(evento.getId());
        if (infoToUpdate.isPresent()) {
            updateData(infoToUpdate.get(),evento);
            return repository.save(infoToUpdate.get());
        }
        return evento;
    }
    //Need work together with put
    public void updateData(Evento infoToUpdate,Evento evento){
        //Pass Data to the new object infoToUpdata from evento that can be updated.
    }

    public Optional<Evento> find(Integer id) {
        return repository.findById(id);
    }
}
