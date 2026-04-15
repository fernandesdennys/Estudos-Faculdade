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

    final double SALARIO_BASE = 2000.0; //Declaração da constant

    List<FolhaDePagamento> folha = new ArrayList<>();
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    FuncionarioPadrao fPadrao = new FuncionarioPadrao();
    FucionarioComissionado fComissionado = new FucionarioComissionado();
    FuncionarioProducao fProducao = new FuncionarioProducao();

    System.out.println("Digite o nome do Funcionário ");
    fPadrao.setNome("Guilherme");
    fPadrao.setMatricula("0129");
    fPadrao.setSalarioFixo(SALARIO_BASE);

    System.out.println();

    fComissionado.setNome("João");
    fComissionado.setMatricula("0214");
    fComissionado.setSalarioFixo(SALARIO_BASE);
    fComissionado.setPercentualDeComissao(5);
    fComissionado.setValorDeVendas(1000);

    System.out.println();

    fProducao.setNome("José");
    fProducao.setMatricula("0324");
    fProducao.setSalarioFixo(SALARIO_BASE);
    fProducao.setQtdePecas(7);
    fProducao.setValordaPeca(50.0);

    System.out.println();

    folha.add(fPadrao);
    folha.add(fComissionado);
    folha.add(fProducao);

    System.out.println("Total de Pessoas Cadastradas: " + folha.size());

    for (FolhaDePagamento f : folha) {
      System.out.println("ID: " + f.getId());
      System.out.println("Nome: " + f.getNome());
      System.out.println("Matricula: " + f.getMatricula());
      System.out.println("Salário Fixo: " + f.getSalarioFixo());
      System.out.println("Salário Final: " + f.calcularSalarioFinal());
    }

    sc.close();
  }
}
