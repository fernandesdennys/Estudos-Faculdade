public class Calculadora {
  // wrappers - envelopaodres
Double numero1;
Double numero2;

public Calculadora(Double numero1, Double numero2) {
  this.numero1 = numero1;
  this.numero2 = numero2;
}

  Double soma () {
        return numero1 + numero2;
  }
}