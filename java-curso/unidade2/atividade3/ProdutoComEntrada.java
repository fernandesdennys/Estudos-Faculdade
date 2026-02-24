package atividade3;
import java.util.Scanner;

public class ProdutoComEntrada {
  public static void main(String[] args) {
   Scanner entrada = new Scanner(System.in);

   System.out.println("Digite o primeiro número:");
    int Num1 = entrada.nextInt();

    System.out.println("Digite o segundo número:");
    int Num2 = entrada.nextInt();

    int Produto = Num1 + Num2; 
    System.out.println("Produto: " + Produto);

    System.out.println("Operação realizada com sucesso!");

    entrada.close();
  }
}
