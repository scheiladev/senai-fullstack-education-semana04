import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio03 {

  public static void main(String[] args) {

    List<String> listaCursos = new ArrayList<>();
    List<String> listaProfessores = new ArrayList<>();

    Scanner entrada = new Scanner(System.in);

    do {
      System.out.println("/-------- MENU --------/");
      System.out.println("1 - Adicionar Curso");
      System.out.println("2 - Adicionar Professor");
      System.out.println("3 - Remover Curso");
      System.out.println("4 - Remover Professor");
      System.out.println("5 - Exibir Cursos");
      System.out.println("6 - Exibir Professores");
      System.out.println("0 - Sair");
      System.out.println("/----------------------/");
      System.out.println();

      System.out.print("Digite a opção desejada: ");
      int opcao = entrada.nextInt();
      System.out.println();

      switch (opcao) {
        case 1:
          adicionarCurso(entrada, listaCursos);
          break;
        case 2:
          adicionarProfessor(entrada, listaProfessores);
          break;
        case 3:
          removerCursoLista(entrada, listaCursos);
          break;
        case 4:
          removerProfessorLista(entrada, listaProfessores);
          break;
        case 5:
          exibirCursos(listaCursos);
          break;
        case 6:
          exibirProfessores(listaProfessores);
          break;
        case 0:
          exibirCursos(listaCursos);
          exibirProfessores(listaProfessores);
          System.exit(0);
          break;
        default:
          System.out.println("Opção inválida! Tente novamente.");
      }
    } while (true);

  }
  public static void adicionarCurso(Scanner entrada, List<String> listaCursos) {
    System.out.print("Digite o curso que deseja adicionar: ");
    String curso = entrada.next();
    listaCursos.add(curso);
    System.out.println();
  }

  public static void adicionarProfessor(Scanner entrada, List<String> listaProfessores) {
    System.out.print("Digite o professor que deseja adicionar: ");
    String professor = entrada.next();
    listaProfessores.add(professor);
    System.out.println();
  }

  public static int listarPedirIndiceCurso(Scanner entrada, List<String> listaCursos) {
    exibirCursos(listaCursos);
    System.out.print("Informe o indice do curso que deseja remover: ");
    return entrada.nextInt();
  }

  public static int listarPedirIndiceProfessor(Scanner entrada, List<String> listaProfessores) {
    exibirCursos(listaProfessores);
    System.out.print("Informe o indice do professor que deseja remover: ");
    return entrada.nextInt();
  }

  public static void removerCursoLista(Scanner entrada, List<String> listaCursos) {
    if (listaCursos.isEmpty()) {
      System.out.println("Nenhum curso cadastrado. Escolha outra opção.");
    } else {
      int indice = listarPedirIndiceCurso(entrada, listaCursos);
      removerCurso(indice, listaCursos);
    }
    System.out.println();
  }

  public static void removerProfessorLista(Scanner entrada, List<String> listaProfessores) {
    if (listaProfessores.isEmpty()) {
      System.out.println("Nenhum professor cadastrado. Escolha outra opção.");
    } else {
      int indice = listarPedirIndiceProfessor(entrada, listaProfessores);
      removerProfessor(indice, listaProfessores);
    }
    System.out.println();
  }

  public static void removerCurso(int indice, List<String> listaCursos) {
    if (listaCursos.size() <= indice) {
      System.out.println("Curso não existe!");
    } else {
      listaCursos.remove(indice);
    }
  }

  public static void removerProfessor(int indice, List<String> listaProfessores) {
    if (listaProfessores.size() <= indice) {
      System.out.println("Professor não existe!");
    } else {
      listaProfessores.remove(indice);
    }
  }

  public static void exibirCursos(List<String> listaCursos) {
    if (listaCursos.isEmpty()) {
      System.out.println("Nenhum curso cadastrado.");
    } else {
      System.out.println("/------------------/");
      System.out.println("/ Lista de Cursos: /");
      for (int i = 0; i < listaCursos.size(); i++) {
        String curso = listaCursos.get(i);
        System.out.println(i + ". " + curso);
      }
      System.out.println("/------------------/");
    }
    System.out.println();

  }

  public static void exibirProfessores(List<String> listaProfessores) {
    if (listaProfessores.isEmpty()) {
      System.out.println("Nenhum professor cadastrado.");
    } else {
      System.out.println("/-----------------------/");
      System.out.println("/ Lista de Professores: /");
      for (int i = 0; i < listaProfessores.size(); i++) {
        String professor = listaProfessores.get(i);
        System.out.println(i + ". " + professor);
      }
      System.out.println("/-----------------------/");
    }
    System.out.println();
  }
}