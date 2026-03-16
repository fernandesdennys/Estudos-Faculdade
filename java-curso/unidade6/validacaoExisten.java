package unidade6;

import java.util.Scanner;

public class validacaoExisten {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    // while para validação com leitura já existente
    System.out.print("Informe A Quantidade De Amostras (Maior Que Zero): ");
int amostras = entrada.nextInt();

while (amostras <= 0) {
    System.out.print("Valor Invalido. Digite Novamente: ");
    amostras = entrada.nextInt();

    entrada.close();
}
  }
}
