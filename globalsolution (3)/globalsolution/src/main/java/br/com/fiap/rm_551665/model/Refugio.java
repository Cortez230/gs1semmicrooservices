package br.com.fiap.rm_551665.globalsolution.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Refugio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String local;
    private int capacidade;
    private Long tamanho;

    public Long getId()  {
        return id;
    }

public void setId(Long id)  {
        this.id = id;
    }

public String getNome()  {
        return nome;
    }

public void setNome(String nome)  {
        this.nome = nome;
    }

public String getLocal()  {
        return local;
    }

public void setLocal(String local)  {
        this.local = local;
    }

public int getCapacidade()  {
        return capacidade;
    }

public void setCapacidade(int capacidade)  {
        this.capacidade = capacidade;
    }

public Long getTamanho()  {
        return tamanho;
    }

public void setTamanho(Long tamanho)  {
        this.tamanho = tamanho;
    }

}

