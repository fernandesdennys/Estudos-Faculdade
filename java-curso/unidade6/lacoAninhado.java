package unidade6;

import java.util.Scanner;

public class lacoAninhado {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    for (int turno = 1; turno <= 3; turno++) {
    System.out.print("Quantidade De Amostras Do Turno " + turno + ": ");
    int n = entrada.nextInt();

    double soma = 0.0;

    for (int i = 1; i <= n; i++) {
        System.out.print("Tempo Da Amostra " + i + ": ");
        double tempo = entrada.nextDouble();
        soma += tempo;
    }

    double mediaTurno = soma / n;
    System.out.println("Media Do Turno " + turno + ": " + String.format("%.2f", mediaTurno));

  }
  entrada.close();
  }
}
