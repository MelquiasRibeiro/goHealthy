package com.goHealthy.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.goHealthy.Evento;

@RestController
@RequestMapping(value = "/eventos")
public class EventoResource {
	
	@RequestMapping(method =RequestMethod.GET)
	public List<Evento> listarEventos(){
		Evento E1 = new Evento(01, "corrida", "reviver", "eu", "10", "corrida");
		Evento E2 = new Evento(01, "futebol", "praia", "eu", "9", "futebol");

	List<Evento>lista= new ArrayList<>();
	lista.add(E1);
	lista.add(E2);

	return lista;
	}

}
