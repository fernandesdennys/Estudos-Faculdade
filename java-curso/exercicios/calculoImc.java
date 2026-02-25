package exercicios;

import java.util.Scanner;

public class calculoImc {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("DIGTE SEU NOME:");
    String nome = leitor.nextLine().trim();

    System.out.println("DIGITE SEU PESO (kg):");
    double peso = leitor.nextDouble();

    System.out.println("DIGITE SUA ALTURA (m):");
    double altura = leitor.nextDouble();
    System.out.println("\nDADOS COLETADOS COM SUCESSO!\n");
    double imc = peso / (altura * altura);

    System.out.println("NOME: " + nome.toUpperCase());
    System.out.println("PESO: " + peso);
    System.out.println("ALTURA: " + altura);
    System.out.printf("SEU IMC É: %.2f%n" + imc);

    System.out.println("CLASSIFICAÇÃO: ");

     if (imc < 18.5) {
      System.out.println("ABAIXO DO PESO NORMAL");
    } else if (imc >= 18.5 && imc < 25.0) {
      System.out.println("PESO NORMAL");
    } else if (imc >= 25.0 && imc < 30.0) {
      System.out.println("EXCESSO DE PESO");
    } else if (imc >= 30.0 && imc < 35.0) {
      System.out.println("OBESIDADE CLASSE 1");
    } else if (imc >= 35.0 && imc < 40.0) {
      System.out.println("OBESIDADE CLASSE 2");
     } else {
      System.out.println("OBESIDADE CLASSE 3");
    }
    leitor.close();
  }
}
