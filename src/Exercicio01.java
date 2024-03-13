import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {

  public static void main(String[] args) {

    List<String> listaCursos = new ArrayList<>();
    List<String> listaProfessores = new ArrayList<>();

    Scanner entrada = new Scanner(System.in);

    do {
      System.out.println("/-------- MENU --------/");
      System.out.println("1 - Adicionar Curso");
      System.out.println("2 - Adicionar Professor");
      System.out.println("3 - Exibir Cursos");
      System.out.println("4 - Exibir Professores");
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
          exibirCursos(listaCursos);
          break;
        case 4:
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

  public static void exibirCursos(List<String> listaCursos) {
    if (listaCursos.isEmpty()) {
      System.out.println("Nenhum curso cadastrado.");
    } else {
      System.out.println("/------------------/");
      System.out.println("/ Lista de Cursos: /");
      for (String curso : listaCursos) {
        System.out.println("* " + curso);
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
      for (String professor : listaProfessores) {
        System.out.println("* " + professor);
      }
      System.out.println("/-----------------------/");
    }
    System.out.println();
  }
}
