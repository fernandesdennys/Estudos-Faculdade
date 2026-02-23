import java.util.Scanner;

public class EstruturasSelecao {
  public static void main(String[] args) {
    System.out.println("--------------------------------------");
    System.out.println("Bem vindo ao canal! Temos as seguintes opções");
    System.out.println("'. Se inscrever");
    System.out.println("1. Dar um like");
    System.out.println("3. Compartilhar");
    System.out.println("4. Ativar notificações");
    System.out.println("Digite a opção desejada:");

    Scanner scanner = new Scanner(System.in);
    int opcao = scanner.nextInt();
    scanner.close();

//     if (opcao == 1)
//       System.out.println("Obrigado por se inscrever");
//     else if (opcao == 2)
//       System.out.println("Obrigado pelo like");
//     else if (opcao== 3)
//       System.out.println("Obrigado por compartilhar"); 
//     else if (opcao == 4)
//       System.out.println("Obrigado por ativar as notificações");
//     else
//       System.out.println("Digite uma opção VÁLIDA");

  String mensagem = switch (opcao) {
   case 1 -> "Obrigado por se inscrever";
   case 2 -> "Obrigado pelo like";
   case 3 -> "Obrigado por compartilhar";
   case 4 -> "Obrigado por ativar as notificações";
   default -> "Digite uma opção VÁLIDA";
   };
   System.out.println(mensagem);
  }
}
