package unidade5.atividade2;

import java.util.Locale;
import java.util.Scanner;

public class IdenficacaoDeBatimentos {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    double pulsacao = entrada.nextDouble();

    if(pulsacao < 60){
      System.out.println("Braquicardia");
    } else if (pulsacao >= 60 && pulsacao < 100) {
      System.out.println("Normal");
    } else {
      System.out.println("Taquicardia");
    }
    entrada.close();
  }
}
