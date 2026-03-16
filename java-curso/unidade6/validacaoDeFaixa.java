package unidade6;

import java.util.Scanner;

public class validacaoDeFaixa {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    double ph;
    do {
      System.out.print("Informe O pH (Entre 0 E 14): ");
      ph = entrada.nextDouble();
    } while (ph < 0 || ph > 14);
    System.out.println("pH Valido: " + ph);
    entrada.close();
  }
}
