package funcionarios.entities;

import funcionarios.pagamento.FolhaDePagamento;

public class FuncionarioProducao extends FolhaDePagamento {
private int qtdePecas;
private double valorDaPeca;

  public FuncionarioProducao() {
  
}

  public FuncionarioProducao(String nome, String matricula, int qtdePecas, double valorDaPeca) {
    super(nome, matricula);
    this.qtdePecas = qtdePecas;
    this.valorDaPeca = valorDaPeca;
  }

  public int getQtdePecas() {
    return qtdePecas;
  }

  public void setQtdePecas(int qtdePecas) {
    this.qtdePecas = qtdePecas;
  }

  public double getValorDaPeca() {
    return valorDaPeca;
  }

  public void setValorDaPeca(double valorDaPeca) {
    this.valorDaPeca = valorDaPeca;
  }

  @Override
  public double calcularSalarioFinal() {
    double valorDoBonus = valorDaPeca * qtdePecas;
    return getsalarioBase() + valorDoBonus;
  }

  @Override
  public String toString() {
    return "Fucionario Produção:" +
    "\n ID: " + getId() +
    "\nNome: " + getNome() +
    "\nMatricula: " + getMatricula() +
    "\nQuantidade de peças: " +  qtdePecas +
    "\nValor da Peça: " + valorDaPeca +
    "\nSalarioFinal: " + calcularSalarioFinal();
  }

}
