package unidade5.atividade1;

import java.util.Locale;
import java.util.Scanner;

public class sistemaDesconto {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    System.out.println("Insira o valor da sua compra:");
    double valorCompra = entrada.nextDouble();
  
    if (valorCompra >= 500 ) {
      double descontoMax = valorCompra * 0.20;
      System.out.printf("Desconto aplicado: 20%%. Sua compra ultrapassou R$ 500,00 e recebeu o benefício máximo de desconto no valor de: %.2f%n", descontoMax);
    } else if (valorCompra >= 200.00) {
      double descontoMed = valorCompra * 0.10;
      System.out.printf("Desconto aplicado: 10%%. Sua compra se enquadra na faixa de desconto intermediária de: %.2f%n", descontoMed);
    } else {
      System.out.println("Nenhum desconto aplicado. Compras abaixo de R$ 200,00 não possuem desconto disponível.");
    }

    entrada.close();
  }
}
