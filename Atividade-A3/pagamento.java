import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import funcionarios.entities.FucionarioComissionado;
import funcionarios.entities.FuncionarioPadrao;
import funcionarios.entities.FuncionarioProducao;
import funcionarios.pagamento.FolhaDePagamento;

public class pagamento {
  public static void main(String[] args) {

    List<FolhaDePagamento> folha = new ArrayList<>();
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int opcao;

    do {
      System.out.println("===== MENU =====");
      System.out.println("Tipo de Funcionário");
      System.out.println("1 - Funcionário Padrão");
      System.out.println("2 - Funcionário Comissionado");
      System.out.println("3 - Funcionário de Produção");
      System.out.println("4 - Folha de Pagamento");
      System.out.println("0 - Sair\n");
      System.out.print("Digite uma das opções acima: ");

      opcao = sc.nextInt();
      sc.nextLine();

      switch (opcao) {
        case 1:
          System.out.println("Digite o nome do funcionário: ");
          String nomePadrao = sc.nextLine();

          System.out.println("Digite a matrícula do funcionário ");
          String matriculaPadrao = sc.nextLine();

          FuncionarioPadrao fPadrao = new FuncionarioPadrao( nomePadrao, matriculaPadrao );
          folha.add(fPadrao);
          System.out.println("=== Funcionario Padrao cadastrado com sucesso ===\n");
          break;
          
        case 2:
          System.out.println("Digite o nome do funcionário: ");
          String nomeComissionado = sc.nextLine();

          System.out.println("Digite a matrícula do funcionário ");
          String matriculaComissionado = sc.nextLine();
          
          System.out.println("Digite o valor da venda: ");
          double valorDeVendas = sc.nextDouble();

          System.out.println("Digte a % da comissão: ");
          double percentualDeComissao = sc.nextDouble();
          sc.nextLine();
          FucionarioComissionado fComissionado = new FucionarioComissionado(nomeComissionado, matriculaComissionado, valorDeVendas, percentualDeComissao);
          folha.add(fComissionado);
          System.out.println("=== Funcionario Comissionado cadastrado com sucesso ===\n");
          break;

        case 3:
        System.out.println("Digite o nome do funcionário: ");
          String nomeProducao = sc.nextLine();

          System.out.println("Digite a matrícula do funcionário ");
          String matriculaPorducao = sc.nextLine();
          
          System.out.println("Digite a quantidade produzida: ");
          int qtdePecas = sc.nextInt();

          System.out.println("Digte o valor da peça: ");
          double valorDaPeca = sc.nextDouble();
          sc.nextLine();
          FuncionarioProducao fProducao = new FuncionarioProducao(nomeProducao, matriculaPorducao, qtdePecas, valorDaPeca);
          folha.add(fProducao);
          System.out.println("=== Funcionario Produção cadastrado com sucesso ===\n");
          break;
      
          case 4:
          System.out.println("Folha de pagamento: ");
          System.out.println("Total de Pessoas Cadastradas: " + folha.size());
          System.out.println("---------------------");
          for(FolhaDePagamento f : folha) {
            System.out.println(f.toString());
            System.out.println("---------------------");
          }
            break;
            case 0:
              System.out.println("Consulta finalizada.");
              break;
        default:
            System.out.println("OPÇÃO INVÁLIDA!!!");
            System.out.println("Digite uma opção VÁLIDA");
          break;
      }

    } while (opcao != 0);

    sc.close();
  }
}
