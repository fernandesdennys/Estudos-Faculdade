package funcionarios.entities;

import funcionarios.pagamento.FolhaDePagamento;

public class FuncionarioProducao extends FolhaDePagamento {
private int qtdePecas;
private double valordaPeca;

  public FuncionarioProducao() {
  
}

  public FuncionarioProducao(long id, String nome, String matricula, double salarioFixo) {
    super(id, nome, matricula, salarioFixo);
  }

  public int getQtdePecas() {
    return qtdePecas;
  }

  public void setQtdePecas(int qtdePecas) {
    this.qtdePecas = qtdePecas;
  }

  public double getValordaPeca() {
    return valordaPeca;
  }

  public void setValordaPeca(double valordaPeca) {
    this.valordaPeca = valordaPeca;
  }

  @Override
  public double calcularSalarioFinal() {
    return 0;
  }

  @Override
  public String toString() {
    return "Fucionario de Produção:" +
    "\nQuantidade de peças: " + qtdePecas +
    "\nValor da peça: " + valordaPeca;
    
  }

  
}
