public class Conta {
  static double saldoContaConjunta;
  double saldo;
  final static double TAXA_SERVICOS = 10.5; // Snake Case XXXX_XXXXX_XX


 static void depositarContaConjunta(double valor) {
    saldoContaConjunta += valor;
  }
  void depositarConta(double valor) {
    saldo += valor;
  }
  
}
