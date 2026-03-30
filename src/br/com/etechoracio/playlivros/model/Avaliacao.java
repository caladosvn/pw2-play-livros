package br.com.etechoracio.playlivros.model;

import java.time.LocalDateTime;

public class Avaliacao {
    public int estrelas;
    public String titulo;
    public LocalDateTime data;
    public String comentario;
    public Usuario usuario;
    public boolean aprovado;
}
