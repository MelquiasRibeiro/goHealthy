package com.goHealthy.resources;



import com.goHealthy.domain.Aspirante;
import com.goHealthy.domain.Evento;
import com.goHealthy.services.AspiranteService;
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
    private EventoService eventoService;

    @Autowired
    private AspiranteService aspiranteService;

    @GetMapping
    public List<Evento> getAll(){
        return eventoService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Evento> get(@PathVariable Integer id){
        Optional<Evento> evento = eventoService.find(id);
        if (!(evento.isPresent())) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(evento.get());
    }

    @PostMapping("/{id}/participate")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Evento> post(@PathVariable Integer id, @RequestBody Aspirante aspirante){
        Optional<Evento> evento = eventoService.find(id);
        if(!(evento.isPresent())) {
            return ResponseEntity.notFound().build();
        }
        else{
            Optional<Aspirante> aspiranteById=aspiranteService.find(aspirante.getId());
            if(aspiranteById.isPresent()){
                evento.get().getParticipantesEvento().add(aspiranteById.get());
                eventoService.post(evento.get());
                        return ResponseEntity.ok(evento.get());
            }
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Evento post(@RequestBody Evento evento){
        return eventoService.post(evento);
    }
}
