package br.com.fiap.rm_551665.globalsolution.dto.catastrofe;

import br.com.fiap.rm_551665.globalsolution.model.Catastrofe;

public class CatastrofeResponse {

    private Long id;
    private String nome;
    private String tipo;
    private String nivelPerigo;
    private String regiaoAfetada;

    public CatastrofeResponse toDto(Catastrofe catastrofe){
        this.setId(catastrofe.getId());
        this.setNome(catastrofe.getNome());
        this.setTipo(catastrofe.getTipo());
        this.setNivelPerigo(catastrofe.getNivelPerigo());
        this.setRegiaoAfetada(catastrofe.getRegiaoAfetada());
        return this;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNivelPerigo() {
        return nivelPerigo;
    }

    public void setNivelPerigo(String nivelPerigo) {
        this.nivelPerigo = nivelPerigo;
    }

    public String getRegiaoAfetada() {
        return regiaoAfetada;
    }

    public void setRegiaoAfetada(String regiaoAfetada) {
        this.regiaoAfetada = regiaoAfetada;
    }

}
