package br.com.etechoracio.playlivros.model;

import java.time.LocalDateTime;

public class Avaliacao {
    public int estrelas;
    public String titulo;
    public LocalDateTime data;
    public String comentario;
    public Usuario usuario;
    public boolean aprovado;

    public void exibir(){
        System.out.println("=============================");
        System.out.println("Usuário: " + usuario);
        System.out.println("Data: " + data);
        System.out.println("Aprovado: " + aprovado);
        System.out.println("Comentário: " + comentario);
    }
}
