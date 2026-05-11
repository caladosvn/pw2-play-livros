package br.com.etechoracio.playlivros.model;

import br.com.etechoracio.playlivros.enums.DisponibilidadeEnum;
import br.com.etechoracio.playlivros.enums.VersaoEnum;

import java.time.LocalDate;
import java.time.LocalTime;

public class Livro {
   //tipo nomeVariavel;
   public String titulo;
   public String autor;
   public String narrador;
   public String editora;
   public LocalTime duracao;
   public VersaoEnum versao;
   public double preco;
   public String resumo;
   public LocalDate dataLancamento;

   public void exibir(){
      System.out.println("Titulo: " + titulo);
      System.out.println("Autor: " + autor);
      System.out.println("Narrador: " + narrador);
      System.out.println("Editora: " + editora);
      System.out.println("Preço: " + preco);
      System.out.println("Duração: " + duracao);
      System.out.println("__________________");

   }

   public DisponibilidadeEnum obterDisponibilidade(){
      LocalDate dataAtual = LocalDate.now();
      if(dataLancamento == null){
         return DisponibilidadeEnum.INDISPONIVEL;
      } else if (dataLancamento.isAfter(dataAtual)){
         return DisponibilidadeEnum.EM_PRE_VENDA;
      } else if (dataLancamento.isAfter(dataAtual.minusDays(30))) {
         return DisponibilidadeEnum.LANCAMENTO_RECENTE;
      }else{
         return DisponibilidadeEnum.DISPONIVEL;
      }
   }
   public void exibir3(){
      System.out.println("Data de Lançamento: " + dataLancamento);
      System.out.println("Disponibilidade: " + obterDisponibilidade());
   }
}
