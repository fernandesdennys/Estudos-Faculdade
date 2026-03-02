package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MeuLaboratorio {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner entrada = new Scanner(System.in);

    System.out.println("=== RELATÓRIO DIÁRIO DO LABORATÓRIO ===");

    System.out.println("Informe a quantidade de amostras necessárias:");
    int amostras = entrada.nextInt();

    System.out.println("Informe o tempo TOTAL em minutos:");
    double tempoTotal = entrada.nextDouble();

    System.out.println("Informe os resultados válidos:");
    int validos = entrada.nextInt();

    // PROCESSAMENTO
    double tempoMedio = tempoTotal / amostras;
    double percentualValidos = (validos / (double) amostras) * 100;
    
    //SAÍDA
    System.err.println("\n=== RESULTADO ===");
    System.out.println("Tempo médio por amostras (min):"
        +String.format("%.2f", tempoMedio));

    System.out.println("Percentual de resultados válidos (%): " 
        + String.format("%.2f", percentualValidos));
    
    entrada.close();
  }
}
