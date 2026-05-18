package br.com.etechoracio.playlivros.teste;

import br.com.etechoracio.playlivros.enums.VersaoEnum;
import br.com.etechoracio.playlivros.model.Avaliacao;
import br.com.etechoracio.playlivros.model.Livro;
import br.com.etechoracio.playlivros.model.Usuario;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestaAvaliacao {
    static void main() {
        Usuario horacio = new Usuario("Horácio Augusto da Silveira");
        horacio.nome = "Horácio Augusto da Silveira";

        Avaliacao avaliacao = new Avaliacao();
        avaliacao.titulo = "O Pequeno Príncipe";
        avaliacao.aprovado = true;
        avaliacao.setData(LocalDateTime.now());
        avaliacao.setUsuario(horacio);
        avaliacao.estrela = 5;
        avaliacao.comentario = "Livro excelente, muito bom";
        avaliacao.exibir2();

        Avaliacao avaliacaoHoracio = new Avaliacao();
        avaliacaoHoracio.setUsuario(new Usuario("Horácio Augusto da Silveira"));

    }
}
