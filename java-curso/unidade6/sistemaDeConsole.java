package unidade6;

import java.util.Scanner;

public class sistemaDeConsole {
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    /*
    Em sistemas de console, um menu é outra forma clássica de repetição.
    */
   int opcao;
   do {
     System.out.println("\n1 - Registrar Tempo");
     System.out.println("2 - Mostrar Relatorio");
     System.out.println("0 - Sair");
     System.out.print("Escolha: ");
     opcao = entrada.nextInt();
     
     if (opcao == 1) {
       System.out.println("Registrando Tempo...");
      } else if (opcao == 2) {
        System.out.println("Mostrando Relatorio...");
      } else if (opcao != 0) {
        System.out.println("Opcao Invalida.");
      }
    } while (opcao != 0);
    System.out.println("Encerrado.");
    
    entrada.close();
  }  
}
