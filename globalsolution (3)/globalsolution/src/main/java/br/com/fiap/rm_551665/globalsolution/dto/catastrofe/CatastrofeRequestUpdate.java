package br.com.fiap.rm_551665.globalsolution.dto.catastrofe;

import br.com.fiap.rm_551665.globalsolution.model.Catastrofe;

public class CatastrofeRequestUpdate {

    private String nivelPerigo;
    private String regiaoAfetada;

    public Catastrofe toModel(Catastrofe catastrofe){
        catastrofe.setNivelPerigo(this.nivelPerigo);
        catastrofe.setRegiaoAfetada(this.regiaoAfetada);
        return catastrofe;
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

