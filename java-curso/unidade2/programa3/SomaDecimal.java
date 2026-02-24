package programa3;
import java.util.Scanner;

public class SomaDecimal {
  public static void main (String[]args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite o primeiro valor:");
    double a = entrada.nextDouble();
    System.out.println("Digite o segundo valor");
     double b = entrada.nextDouble();
    double soma = a + b;
    System.out.println("A soma é:" + soma);
    entrada.close();
  }  
}
