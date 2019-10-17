package com.goHealthy.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

@Entity
public class Aspirante implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nome;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Email
    private String email;
    private String numero;
    private String conquista;
    private Integer avaliacao;
    private Boolean status;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getConquista() {
        return conquista;
    }

    public void setConquista(String conquista) {
        this.conquista = conquista;
    }

    public Integer getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Integer avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aspirante)) return false;
        Aspirante aspirante = (Aspirante) o;
        return getId().equals(aspirante.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public Aspirante(String nome, Integer id, String email, String numero, Boolean status, String senha) {
        this.nome = nome;
        this.id = id;
        this.email = email;
        this.numero = numero;
        this.status = status;
        this.senha = senha;
    }
}
