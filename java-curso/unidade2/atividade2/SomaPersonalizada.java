package unidade2.atividade2;
import java.util.Scanner;
public class SomaPersonalizada {
  
    public static void main (String[] args) {
      Scanner entrada = new Scanner(System.in);
      
      System.out.println("Digite o primeiro numero");
      int a = entrada.nextInt();
  
      System.out.println("Digite o segundo numero");
      int b = entrada.nextInt();
  
      int soma = a + b;
      System.out.println("Voce digitou " + a + " e " + b + ", a soma foi: " + soma);
      
      entrada.close(); 

}

}