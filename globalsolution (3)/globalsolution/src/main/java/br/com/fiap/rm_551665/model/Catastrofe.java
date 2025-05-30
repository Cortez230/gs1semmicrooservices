package br.com.fiap.rm_551665.globalsolution.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Catastrofe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private String tipo;
    private String nivelPerigo;
    private String regiaoAfetada;

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

public String getTipo()  {
        return tipo;
    }

public void setTipo(String tipo)  {
        this.tipo = tipo;
    }

public String getNivelPerigo()  {
        return nivelPerigo;
    }

public void setNivelPerigo(String nivelPerigo)  {
        this.nivelPerigo = nivelPerigo;
    }

public String getRegiaoAfetada()  {
        return regiaoAfetada;
    }

public void setRegiaoAfetada(String regiaoAfetada)  {
        this.regiaoAfetada = regiaoAfetada;
    }
}
