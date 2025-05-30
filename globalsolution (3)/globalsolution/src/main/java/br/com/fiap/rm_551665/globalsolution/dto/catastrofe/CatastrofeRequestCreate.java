package br.com.fiap.rm_551665.globalsolution.dto.catastrofe;

import br.com.fiap.rm_551665.globalsolution.model.Catastrofe;

public class CatastrofeRequestCreate {

    private String nome;
    private String tipo;
    private String nivelPerigo;
    private String regiaoAfetada;

    public Catastrofe toModel(){
        Catastrofe catastrofe = new Catastrofe();
        catastrofe.setNome(this.nome);
        catastrofe.setTipo(this.tipo);
        catastrofe.setNivelPerigo(this.nivelPerigo);
        catastrofe.setRegiaoAfetada(this.regiaoAfetada);
        return catastrofe;
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
