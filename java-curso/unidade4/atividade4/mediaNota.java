package unidade4.atividade4;

import java.util.Locale;
import java.util.Scanner;

public class mediaNota {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    
    //IN
    System.out.println("Insira a primeira nota:");
    double PrimeiraNota = entrada.nextDouble();
    
    System.out.println("Insira a segunda nota:");
    double SegundaNota = entrada.nextDouble();

    //PROCESS
    double mediaNota = (PrimeiraNota + SegundaNota) / 2;

    //OUT
    System.out.printf("Sua média é: %.2f%n", mediaNota);

    entrada.close();
  }
}
