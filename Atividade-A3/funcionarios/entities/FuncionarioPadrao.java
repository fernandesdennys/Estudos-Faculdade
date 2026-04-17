package funcionarios.entities;
import funcionarios.pagamento.FolhaDePagamento;

public class FuncionarioPadrao extends FolhaDePagamento {

  public FuncionarioPadrao() {
  }

  public FuncionarioPadrao(String nome, String matricula) {
    super(nome, matricula);
  }

  @Override
  public double calcularSalarioFinal() {
    return getsalarioBase();
  }
}
