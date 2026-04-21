import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import funcionarios.entities.FucionarioComissionado;
import funcionarios.entities.FuncionarioPadrao;
import funcionarios.entities.FuncionarioProducao;
import funcionarios.pagamento.FolhaDePagamento;
import utils.Validador;

public class pagamento {

  public static void main(String[] args) {

    List<FolhaDePagamento> folha = new ArrayList<>();
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int opcao = -1;

    while (opcao != 0) {

      System.out.println("\n===== MENU =====");
      System.out.println("1 - Funcionário Padrão");
      System.out.println("2 - Funcionário Comissionado");
      System.out.println("3 - Funcionário de Produção");
      System.out.println("4 - Folha de Pagamento");
      System.out.println("0 - Sair");
      System.out.print("Digite uma opção: ");

      while (!sc.hasNextInt()) {
        System.out.println("Digite uma opção válida.");
        sc.nextLine();
      }

      opcao = sc.nextInt();
      sc.nextLine(); // limpa buffer

      switch (opcao) {

        case 1:

          String nomePadrao;
          while (true) {
            try {
              System.out.print("Nome: ");
              nomePadrao = Validador.validarNome(sc.nextLine());
              break;
            } catch (IllegalArgumentException e) {
              System.out.println("Digite uma informação válida.");
            }
          }

          String matriculaPadrao;
          while (true) {
            try {
              System.out.print("Matrícula: ");
              matriculaPadrao = Validador.validarMatricula(sc.nextLine());
              break;
            } catch (IllegalArgumentException e) {
              System.out.println("Digite uma informação válida.");
            }
          }

          folha.add(new FuncionarioPadrao(nomePadrao, matriculaPadrao));
          System.out.println("=== Funcionário Padrão cadastrado ===");
          break;

        case 2:

          String nomeCom;
          while (true) {
            try {
              System.out.print("Nome: ");
              nomeCom = Validador.validarNome(sc.nextLine());
              break;
            } catch (IllegalArgumentException e) {
              System.out.println("Digite uma informação válida.");
            }
          }

          String matriculaCom;
          while (true) {
            try {
              System.out.print("Matrícula: ");
              matriculaCom = Validador.validarMatricula(sc.nextLine());
              break;
            } catch (IllegalArgumentException e) {
              System.out.println("Digite uma informação válida.");
            }
          }

          double vendas;
          while (true) {
            try {
              System.out.print("Valor de vendas: ");
              while (!sc.hasNextDouble()) {
                System.out.println("Digite um número válido.");
                sc.nextLine();
              }
              vendas = Validador.validarValorPositivo(sc.nextDouble(), "Valor de vendas");
              break;
            } catch (IllegalArgumentException e) {
              System.out.println("Digite uma informação válida.");
            }
          }

          double comissao;
          while (true) {
            try {
              System.out.print("Percentual de comissão: ");
              while (!sc.hasNextDouble()) {
                System.out.println("Digite um número válido.");
                sc.nextLine();
              }
              comissao = Validador.validarPercentual(sc.nextDouble());
              break;
            } catch (IllegalArgumentException e) {
              System.out.println("Digite uma informação válida.");
            }
          }

          sc.nextLine(); // limpa buffer

          folha.add(new FucionarioComissionado(nomeCom, matriculaCom, vendas, comissao));
          System.out.println("=== Funcionário Comissionado cadastrado ===");
          break;

        case 3:

          String nomeProd;
          while (true) {
            try {
              System.out.print("Nome: ");
              nomeProd = Validador.validarNome(sc.nextLine());
              break;
            } catch (IllegalArgumentException e) {
              System.out.println("Digite uma informação válida.");
            }
          }

          String matriculaProd;
          while (true) {
            try {
              System.out.print("Matrícula: ");
              matriculaProd = Validador.validarMatricula(sc.nextLine());
              break;
            } catch (IllegalArgumentException e) {
              System.out.println("Digite uma informação válida.");
            }
          }

          int qtd;
          while (true) {
            try {
              System.out.print("Quantidade produzida: ");
              while (!sc.hasNextInt()) {
                System.out.println("Digite um número válido.");
                sc.nextLine();
              }
              qtd = Validador.validarInteiroPositivo(sc.nextInt(), "Quantidade");
              break;
            } catch (IllegalArgumentException e) {
              System.out.println("Digite uma informação válida.");
            }
          }

          double valor;
          while (true) {
            try {
              System.out.print("Valor por peça: ");
              while (!sc.hasNextDouble()) {
                System.out.println("Digite um número válido.");
                sc.nextLine();
              }
              valor = Validador.validarValorPositivo(sc.nextDouble(), "Valor da peça");
              break;
            } catch (IllegalArgumentException e) {
              System.out.println("Digite uma informação válida.");
            }
          }

          sc.nextLine(); // limpa buffer

          folha.add(new FuncionarioProducao(nomeProd, matriculaProd, qtd, valor));
          System.out.println("=== Funcionário Produção cadastrado ===");
          break;

        case 4:
          System.out.println("\n===== FOLHA DE PAGAMENTO =====");
          System.out.println("Total: " + folha.size());
          System.out.println("-----------------------------");

          for (FolhaDePagamento f : folha) {
            System.out.println(f);
            System.out.println("-----------------------------");
          }
          break;

        case 0:
          System.out.println("Encerrando sistema...");
          break;

        default:
          System.out.println("Opção inválida!");
      }
    }

    sc.close();
  }
}