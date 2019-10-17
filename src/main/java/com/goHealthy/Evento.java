package com.goHealthy;

import java.io.Serializable;

public class  Evento implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;	
	private String lugar;
	private String inscritos;
	private String hora;
	private String categoria;
	
	public Evento() {
		
	}
			
	public Evento(Integer id, String nome, String lugar, String inscritos, String hora, String categoria) {
		super();
		this.id = id;
		this.nome = nome;
		this.lugar = lugar;
		this.inscritos = inscritos;
		this.hora = hora;
		this.categoria = categoria;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getInscritos() {
		return inscritos;
	}

	public void setInscritos(String inscritos) {
		this.inscritos = inscritos;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	

	

}
