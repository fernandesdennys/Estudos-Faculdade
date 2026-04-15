package funcionarios.entities;
import funcionarios.pagamento.FolhaDePagamento;

public class FuncionarioPadrao extends FolhaDePagamento {

  public FuncionarioPadrao() {
  }

  public FuncionarioPadrao(long id, String nome, String matricula, double salarioFixo) {
    super(id, nome, matricula, salarioFixo);
  }

  @Override
  public double calcularSalarioFinal() {
    return 0;
  }
  
}
