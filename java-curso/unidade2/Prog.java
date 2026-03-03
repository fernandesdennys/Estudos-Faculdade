import java.util.Scanner;
public class Prog {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    double valor, saldo = 0;
    // String texto;

    System.out.println("Digite o primeiro valor:");
    valor = leitor.nextDouble();
    saldo = saldo + valor;
    System.out.println("Digite o segundo valor:");
    valor = leitor.nextDouble();
    saldo = saldo + valor;
    
    // texto = String.format("%.2f", saldo);
    System.out.printf("Saldo: R$ %.2f" ,saldo);
    
    leitor.close();

  }
}
