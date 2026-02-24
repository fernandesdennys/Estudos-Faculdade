package atividade3;
import java.util.Scanner;
public class SomaMedia {
  public static void main (String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Digite o primeiro numero");
    double a = entrada.nextDouble();
    
    System.out.println("Digite o segundo numero");
    double b = entrada.nextDouble();
    
    double media = (a + b) / 2;
    System.out.println("Voce digitou " + a + " e " + b + ", a média é: " + media);
    
    entrada.close(); 
    
  }
}

