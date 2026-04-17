package funcionarios.entities;

import funcionarios.pagamento.FolhaDePagamento;

public class FucionarioComissionado extends FolhaDePagamento{
  private double valorDeVendas;
  private double percentualDeComissao;

  public FucionarioComissionado() {
  }

  public FucionarioComissionado(String nome, String matricula, double valorDeVendas,
      double percentualDeComissao) {
    super(nome, matricula);
    this.valorDeVendas = valorDeVendas;
    this.percentualDeComissao = percentualDeComissao;
  }

  

  public double getValorDeVendas() {
    return valorDeVendas;
  }

  public void setValorDeVendas(double valorDeVendas) {
    this.valorDeVendas = valorDeVendas;
  }

  public double getPercentualDeComissao() {
    return percentualDeComissao;
  }

  public void setPercentualDeComissao(double percentualDeComissao) {
    this.percentualDeComissao = percentualDeComissao;
  }

  @Override
  public double calcularSalarioFinal() {
    return getsalarioBase() + (valorDeVendas + percentualDeComissao / 100) ;
  }
  
@Override
  public String toString() {
    return "Fucionario Comissionado:" +
    "\n ID: " + getId() +
    "\nNome: " + getNome() +
    "\nMatricula: " + getMatricula() +
    "\nValor de vendas: " +  valorDeVendas +
    "\nPercentual de comissão: " + percentualDeComissao +
    "\nSalarioFinal: " + calcularSalarioFinal();
  }


}
