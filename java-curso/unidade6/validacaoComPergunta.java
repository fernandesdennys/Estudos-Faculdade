package unidade6;
import java.util.Scanner;

public class validacaoComPergunta {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    //do-while para validação com "pergunta sempre"
    int amostras;
    do {
      System.out.println("Informe a quantidade de amostras (Maior que zero)");
      amostras = entrada.nextInt();
    } while (amostras <= 0);

    entrada.close();
  }
}
