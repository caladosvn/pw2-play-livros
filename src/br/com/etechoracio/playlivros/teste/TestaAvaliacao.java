package br.com.etechoracio.playlivros.teste;

import br.com.etechoracio.playlivros.enums.VersaoEnum;
import br.com.etechoracio.playlivros.model.Avaliacao;
import br.com.etechoracio.playlivros.model.Livro;
import br.com.etechoracio.playlivros.model.Usuario;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestaAvaliacao {
    static void main() {
        Usuario horacio = new Usuario();
        horacio.nome = "Horácio Augusto da Silveira";

        Avaliacao avaliacao = new Avaliacao();
        avaliacao.titulo = "Livro Excelente";
        avaliacao.estrelas = 5;
        avaliacao.data = LocalDateTime.now();
        avaliacao.comentario = "Livro excelente, muito bem escrito. Chegou no prazo e bem embalado";
        avaliacao.aprovado = true;
        avaliacao.usuario = horacio;

        avaliacao.exibir();
    }
}
