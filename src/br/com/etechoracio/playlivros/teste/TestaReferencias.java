package br.com.etechoracio.playlivros.teste;

import br.com.etechoracio.playlivros.model.Livro;

public class TestaReferencias {


    static void main(String[] args) {
        Livro livroA = new Livro ();
        livroA.setTitulo("Meu livro A");
        System.out.println(livroA.getTitulo());

        Livro livroB = livroA;
        livroB.setTitulo("Meu livro B");
        System.out.println(livroB.getTitulo());

        System.out.println(livroA.getTitulo());
        System.out.println();
    }
}