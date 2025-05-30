package br.com.fiap.rm_551665.globalsolution.dto.refugio;

import br.com.fiap.rm_551665.globalsolution.model.Refugio;

public class RefugioRequestUpdate {

    private int capacidade;
    private Long tamanho;

    public Refugio toModel(Refugio refugio){
        refugio.setCapacidade(this.capacidade);
        refugio.setTamanho(this.tamanho);
        return refugio;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Long getTamanho() {
        return tamanho;
    }

    public void setTamanho(Long tamanho) {
        this.tamanho = tamanho;
    }
}
