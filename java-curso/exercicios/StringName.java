package exercicios;

import java.util.Scanner;

public class StringName {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite seu nome:");
    String nome = leitor.nextLine().trim().toUpperCase();

    System.out.println("Digite sua idade:");
    int idade = leitor.nextInt();

    System.out.println("Digite seu saláro:");
    double salario = leitor.nextDouble();
    
    double salarioAnual = salario * 12;

    System.out.println("\nNOME: " + nome);
    System.out.println("CARACTERES: " + nome.length());
    System.out.println("IDADE: " + idade);
    System.out.printf("SALÁRIO ANUAL: %.2f%n", salarioAnual);
        
    leitor.close();
  }
  
}
