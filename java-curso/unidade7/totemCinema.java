package unidade7;

import java.util.Scanner;

public class totemCinema {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Antes de iniciar, Digite seu nome!");
    String nomeCliente = entrada.next();

    System.out.println("Quantos ingressos voce deseja comprar?");
    int quantIngressos = entrada.nextInt();
    entrada.nextLine(); //Limpar o BUFFER

    alertaCliente(nomeCliente, quantIngressos);
    
    //Lista de BRINQUEDOS
    String[] brinquedos = {
      "Montanha Russa",
      "Roda Gigante",
      "Carrossel",
      "Barco viking",
      "Kamikaze"
    };

    System.out.println("\nPerfeito! Agora escolha os brinquedos desejados!");
    
    for (int i = 0; i < quantIngressos; i++) {
      System.out.println("\nEscolha o brinquedo." + (i + 1));

    //Mostrar OPÇÕES
    for (int j = 0; j < brinquedos.length; j++) {
        System.out.println((j + 1) + " - " + brinquedos[j]);
      }
      
      int escolha = entrada.nextInt();

      // Validação simples
      if (escolha >= 1 && escolha <= brinquedos.length) {
        System.out.println("Você escolheu: " + brinquedos[escolha - 1]);
      } else {
        System.out.println("Opção inválida! Tente novamente.");
        i--; // volta uma escolha
      }
    }
    entrada.close();
  }
  public static void alertaCliente(String nomeCliente, int quantIngressos){
     System.out.println("\nOla " + nomeCliente);
     System.out.println("Voçe adiquiriu: " + quantIngressos + " ingressos");
  }
}
