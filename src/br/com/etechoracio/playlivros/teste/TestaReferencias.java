package br.com.etechoracio.playlivros.teste;

import br.com.etechoracio.playlivros.model.Livro;

public class TestaReferencias {

    static void main(String[] args) {
        Livro livroA = new Livro ();
        livroA.titulo = "Meu livro A";
        System.out.println(livroA.titulo);

        Livro livroB = livroA;
        livroB.titulo = "Meu livro B";
        System.out.println(livroB.titulo);

        System.out.println(livroA.titulo);
        System.out.println();
    }
}