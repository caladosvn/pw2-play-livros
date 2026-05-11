package br.com.etechoracio.playlivros.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Avaliacao {
    public int estrela;
    public boolean aprovado;
    public Usuario usuario;
    public String comentario;
    public LocalDateTime data;
    public String titulo;

    public void aprovar(){
        this.aprovado = true;
    }

    public  void exibir(){
        System.out.println(usuario.nome);
        System.out.println(estrela + "estrelas " + titulo);
        System.out.println(data);
        System.out.println(comentario);
    }
    public String obterDataPorExtensao() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy");
        String resultado = formatador.format(data);
        return resultado;
    }


    public void exibir2() {
        if (aprovado) {
            System.out.println("  ");
            System.out.println(usuario.nome);
            System.out.println(estrela + " estrelas " + titulo);
            System.out.println("Avaliado em " + obterDataPorExtensao());
            System.out.println(comentario);
        }

    }
}

