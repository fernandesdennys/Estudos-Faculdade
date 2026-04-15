package funcionarios.entities;

import funcionarios.pagamento.FolhaDePagamento;

public class FucionarioComissionado extends FolhaDePagamento{
  private int valorDeVendas;
  private int percentualDeComissao;

  public FucionarioComissionado() {
  }

  public FucionarioComissionado(long id, String nome, String matricula, double salarioFixo, int valorDeVendas,
      int percentualDeComissao) {
    super(id, nome, matricula, salarioFixo);
    this.valorDeVendas = valorDeVendas;
    this.percentualDeComissao = percentualDeComissao;
  }

  

  public int getValorDeVendas() {
    return valorDeVendas;
  }

  public void setValorDeVendas(int valorDeVendas) {
    this.valorDeVendas = valorDeVendas;
  }

  public int getPercentualDeComissao() {
    return percentualDeComissao;
  }

  public void setPercentualDeComissao(int percentualDeComissao) {
    this.percentualDeComissao = percentualDeComissao;
  }

  @Override
  public double calcularSalarioFinal() {
    return 0.0;
  }
  
@Override
  public String toString() {
    return "Fucionario Comissionado:" +
    "\nValor de vendas: " +  valorDeVendas +
    "\nPercentual de comissão: " + percentualDeComissao;
    
  }


}
