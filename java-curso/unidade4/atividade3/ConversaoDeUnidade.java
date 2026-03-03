package unidade4.atividade3;

import java.util.Locale;
import java.util.Scanner;

public class ConversaoDeUnidade {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    // IN
    System.out.println("=== CONVERSOR DE UNIDADE ===");
    System.out.println("----------------------------");
    System.out.println("Insira uma quantidade em GRAUS para fazer a conversão: ");
    double unidadeGraus = entrada.nextDouble();
    System.out.println("----------------------------");
    System.out.println(" ===AGUARDE O PROCESSO=== ");

    // PROCESS
    double conversaoFahrenheit = unidadeGraus * (9.0 / 5.0) + 32;
    
    // OUT
    System.out.printf("Entrada em Graus: %.2f%n", unidadeGraus);
    System.out.printf("Sua conversão é de: %.2f%n", conversaoFahrenheit);

    entrada.close();
  }
}
