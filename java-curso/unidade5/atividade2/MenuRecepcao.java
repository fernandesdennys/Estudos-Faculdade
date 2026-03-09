package unidade5.atividade2;

import java.util.Locale;
import java.util.Scanner;

public class MenuRecepcao {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    
    int opcao = entrada.nextInt();
    
    switch (opcao) {
      case 1:
      System.out.println("Emergência");
        break;
      case 2:
      System.out.println("Consulta de Rotina");
        break;
      case 3:
      System.out.println("Retirada");
        break;    
      default:
        System.out.println("Opção INVALIDA");
        break;
    }
    entrada.close();
  }
}
