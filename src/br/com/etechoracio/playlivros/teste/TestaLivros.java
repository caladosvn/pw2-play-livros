package br.com.etechoracio.playlivros.teste;

import br.com.etechoracio.playlivros.enums.VersaoEnum;
import br.com.etechoracio.playlivros.model.Avaliacao;
import br.com.etechoracio.playlivros.model.Livro;

import java.time.LocalTime;

public class TestaLivros {
    static void main() {
        Livro primeirolivro = new Livro();
        primeirolivro.setTitulo("Dragon Ball");
        primeirolivro.setAutor("Akira Toriyama");
        primeirolivro.setNarrador("Tem não");
        primeirolivro.setEditora("Panini");
        primeirolivro.setDuracao(LocalTime.of(12,30));
        primeirolivro.setVersao(VersaoEnum.valueOf(String.valueOf(VersaoEnum.INTEGRAL)));
        primeirolivro.setPreco(49.90);
        primeirolivro.setResumo("Esferas do Dragão");

        primeirolivro.exibir();

        Livro segundolivro = new Livro();
        segundolivro.setTitulo("Dragon Ball 2");
        segundolivro.setAutor("Akira Toriyama 2");
        segundolivro.setNarrador("Tem não 2");
        segundolivro.setEditora("Panini 2");
        segundolivro.setDuracao(LocalTime.of(12,30));
        segundolivro.setVersao(VersaoEnum.valueOf(String.valueOf(VersaoEnum.RESUMIDA)));
        segundolivro.setPreco(49.91);
        segundolivro.setResumo("Esferas do Dragão 2");

        segundolivro.exibir();
    }
}
