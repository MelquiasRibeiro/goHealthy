package com.goHealthy.resources;



import com.goHealthy.domain.Evento;
import com.goHealthy.services.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/eventos")
public class EventoController {

    @Autowired
    private EventoService service;

    @GetMapping
    public List<Evento> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Evento> get(@PathVariable Integer id){
        Optional<Evento> evento = service.find(id);
        if (evento.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(evento.get());
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Evento post(@RequestBody Evento evento){
        return service.post(evento);
    }
}
