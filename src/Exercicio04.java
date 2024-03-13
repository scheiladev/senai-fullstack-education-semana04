import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio04 {

  public static void main(String[] args) {

    List<String> listaCursos = new ArrayList<>();
    List<String> listaProfessores = new ArrayList<>();
    List<String> listaCursosConcluidos = new ArrayList<>();

    Scanner entrada = new Scanner(System.in);

    do {
      System.out.println("/-------- MENU --------/");
      System.out.println("1 - Adicionar Curso");
      System.out.println("2 - Remover Curso");
      System.out.println("3 - Exibir Cursos");
      System.out.println("4 - Marcar Curso Concluído");
      System.out.println("5 - Exibir Cursos Concluídos");
      System.out.println("6 - Adicionar Professor");
      System.out.println("7 - Remover Professor");
      System.out.println("8 - Exibir Professores");
      System.out.println("0 - Sair");
      System.out.println("/----------------------/");
      System.out.println();

      System.out.print("Digite a opção desejada: ");
      int opcao = entrada.nextInt();
      System.out.println();

      switch (opcao) {
        case 1:
          adicionarItem(entrada, listaCursos);
          break;
        case 2:
          System.out.println("*** Lista de Cursos: ***");
          removerItemLista(entrada, listaCursos);
          break;
        case 3:
          System.out.println("*** Lista de Cursos: ***");
          exibirLista(listaCursos);
          break;
        case 4:
          marcarCursoConcluido(entrada, listaCursos, listaCursosConcluidos);
          break;
        case 5:
          System.out.println("*** Lista de Cursos Concluídos: ***");
          exibirLista(listaCursosConcluidos);
          break;
        case 6:
          adicionarItem(entrada, listaProfessores);
          break;
        case 7:
          System.out.println("*** Lista de Professores: ***");
          removerItemLista(entrada, listaProfessores);
          break;
        case 8:
          System.out.println("*** Lista de Professores: ***");
          exibirLista(listaProfessores);
          break;
        case 0:
          System.out.println("*** Lista de Cursos: ***");
          exibirLista(listaCursos);
          System.out.println();
          System.out.println("*** Lista de Cursos Concluídos: ***");
          exibirLista(listaCursosConcluidos);
          System.out.println();
          System.out.println("*** Lista de Professores: ***");
          exibirLista(listaProfessores);
          System.exit(0);
          break;
        default:
          System.out.println("Opção inválida! Tente novamente.");
      }
    } while (true);

  }
  public static void adicionarItem(Scanner entrada, List<String> listaItens) {
    System.out.print("Digite o item que deseja adicionar: ");
    String item = entrada.next();
    listaItens.add(item);
    System.out.println();
  }

  public static int listarPedirIndice(Scanner entrada, List<String> listaItens) {
    exibirLista(listaItens);
    System.out.print("Informe o índice do item: ");
    return entrada.nextInt();
  }

  public static void removerItemLista(Scanner entrada, List<String> listaItens) {
    if (listaItens.isEmpty()) {
      System.out.println("Nenhum item cadastrado. Escolha outra opção.");
    } else {
      int indice = listarPedirIndice(entrada, listaItens);
      removerItem(indice, listaItens);
    }
    System.out.println();
  }

  public static void removerItem(int indice, List<String> listaItens) {
    if (listaItens.size() <= indice) {
      System.out.println("Item não existe!");
    } else {
      listaItens.remove(indice);
    }
  }

  public static void marcarCursoConcluido(Scanner entrada, List<String> listaItens1, List<String> listaItens2) {
    System.out.println("*** Lista de Cursos: ***");
    int indice = listarPedirIndice(entrada, listaItens1);
    if (listaItens1.size() <= indice) {
      System.out.println("Item não existe!");
    } else {
      listaItens2.add(listaItens1.get(indice));
      removerItem(indice, listaItens1);
    }
    System.out.println();
  }

  public static void exibirLista(List<String> listaItens) {
    if (listaItens.isEmpty()) {
      System.out.println("Nenhum item cadastrado.");
    } else {
      for (int i = 0; i < listaItens.size(); i++) {
        String item = listaItens.get(i);
        System.out.println(i + ". " + item);
      }
    }
    System.out.println();

  }
}