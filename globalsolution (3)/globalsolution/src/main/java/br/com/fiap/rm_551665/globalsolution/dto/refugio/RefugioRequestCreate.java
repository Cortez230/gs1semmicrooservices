package br.com.fiap.rm_551665.globalsolution.dto.refugio;

import br.com.fiap.rm_551665.globalsolution.model.Refugio;

public class RefugioRequestCreate {

    private String nome;
    private String local;
    private int capacidade;
    private Long tamanho;

    public Refugio toModel(){
        Refugio refugio = new Refugio();
        refugio.setNome(this.nome);
        refugio.setCapacidade(this.capacidade);
        refugio.setLocal(this.local);
        refugio.setTamanho(this.tamanho);
        return refugio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
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
