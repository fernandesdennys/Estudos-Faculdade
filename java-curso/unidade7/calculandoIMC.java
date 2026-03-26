package unidade7;

import java.util.Locale;
import java.util.Scanner;

public class calculandoIMC {
  public static double calcularIMC(double peso, double altura) {
    return peso / (altura * altura);
  }
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner entrada = new Scanner(System.in);

    //ENTRADA DE DADOS
    System.out.println("Digite sua altura(cm):");
    double altura = entrada.nextDouble() / 100;

    System.out.println("Dugite seu peso:");
    double peso = entrada.nextDouble();
    
    //CHAMADA
    double imc = calcularIMC(peso, altura);

    //SAÍDA
    System.out.printf("Seu IMC é: %2f%n", imc);

    //CLASSIFICAÇÃO
    if (imc >= 30) {
      System.out.println("Obesidade");
    } else if (imc >= 25) {
      System.out.println("Sobrepeso");
    } else if (imc >= 18.5) {
      System.out.println("Normal"); 
    } else {
      System.out.println("Baixo Peso");
    }
    entrada.close();
  }
}

