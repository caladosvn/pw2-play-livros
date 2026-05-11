package br.com.etechoracio.playlivros.teste;

import br.com.etechoracio.playlivros.enums.VersaoEnum;
import br.com.etechoracio.playlivros.model.Avaliacao;
import br.com.etechoracio.playlivros.model.Livro;

import java.time.LocalTime;

public class TestaLivros {
    static void main() {
        Livro primeirolivro = new Livro();
        primeirolivro.titulo = "Dragon Ball";
        primeirolivro.autor = "Akira Toriyama";
        primeirolivro.narrador = "Tem não";
        primeirolivro.editora = "Panini";
        primeirolivro.duracao = LocalTime.of(12,30);
        primeirolivro.VersaoEnum = String.valueOf(VersaoEnum.INTEGRAL);
        primeirolivro.preco = 49.90;
        primeirolivro.resumo = "Esferas do Dragão";

        primeirolivro.exibir();

        Livro segundolivro = new Livro();
        segundolivro.titulo = "Dragon Ball 2";
        segundolivro.autor = "Akira Toriyama 2";
        segundolivro.narrador = "Tem não 2";
        segundolivro.editora = "Panini 2";
        segundolivro.duracao = LocalTime.of(12,30);
        segundolivro.VersaoEnum = String.valueOf(VersaoEnum.INTEGRAL);
        segundolivro.preco = 49.91;
        segundolivro.resumo = "Esferas do Dragão 2";

        segundolivro.exibir();
    }
}
