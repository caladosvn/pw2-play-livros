package br.com.etechoracio.playlivros.model;

public class Usuario {
    public String nome;
    public String foto;

    public Usuario (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
