package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class RelatorioProducao {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    //IN
    System.out.println("Insira a quantidade total de produção registrada:");
    int producaoTotal = entrada.nextInt();

    System.out.println("Insira o total de unidades classificadas como defeituosas:");
    int pecasDefeituosas = entrada.nextInt();

    System.out.println("Insira a duração total da produção em minutos:");
    double tempoProducao = entrada.nextDouble();

    //PROCESS
    int totalPecasAprovado = producaoTotal - pecasDefeituosas;
    double percentualAprovado = (totalPecasAprovado / (double) producaoTotal) * 100.0;
    double percentualReprovado = (pecasDefeituosas / (double) producaoTotal) * 100.0;
    double tempoMedioProducao = (tempoProducao / producaoTotal);

    //OUT
    System.out.println("=== GERANDO RELATÓRIO DE PRODUTIVIDADE ===");

    System.out.println("TOTAL de peças aprovadas:" + totalPecasAprovado);
    System.out.println("-----------------------------"); 
    System.out.println("Percentual de peças aprovadas (%):"
    + String.format("%.2f", percentualAprovado));
    System.out.println("-----------------------------"); 
    System.out.printf("Percentual de peças com defeito (%%): %.2f%n", percentualReprovado);    
    System.out.println("-----------------------------"); 
    System.out.println("Tempo médio de produção por peça (min):" + tempoMedioProducao);
    System.out.println("-----------------------------"); 

    System.out.println("RESUMO CONSOLIDADO DA PRODUÇÃO:");

    System.out.println("Total produzido: " + producaoTotal);
    System.out.println("Total Aprovado: " + totalPecasAprovado);
    System.out.println("Total Defeituoso: " + pecasDefeituosas);
    System.out.printf("Taxa de Aprovação (%%): %.2f%n ", percentualAprovado);
    System.out.printf("Taxa de Reprovação (%%): %.2f%n ", percentualReprovado);
    System.out.println("Tempo médio por peça: " + tempoMedioProducao + "min");
    System.out.println("-----------------------------"); 

    entrada.close();
  }
}
