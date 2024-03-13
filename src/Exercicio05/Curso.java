package Exercicio05;

import java.util.ArrayList;
import java.util.List;

public class Curso {

  String nome;
  String descricao;
  List<String> professores = new ArrayList<>();
  int cargaHoraria;

  public void progresso() {
    System.out.println("Método de progresso.");
  }

  public void notas() {
    System.out.println("Método de notas.");
  }
  public void participacao() {
    System.out.println("Método de participação.");
  }
}