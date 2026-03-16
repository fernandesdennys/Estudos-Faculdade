package unidade6;

import java.util.Scanner;

public class tentativasLimitadas {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    final int maxTentativas = 3;
int tentativas = 0;
boolean autenticado = false;

while (tentativas < maxTentativas && !autenticado) {
    System.out.print("Digite A Senha: ");
    String senha = entrada.next();

    if (senha.equals("java123")) {
        autenticado = true;
    } else {
        System.out.println("Senha Incorreta.");
    }
    tentativas++;
}

if (autenticado) {
    System.out.println("Acesso Liberado.");
} else {
    System.out.println("Acesso Bloqueado Por Excesso De Tentativas.");
}
entrada.close();
}
}
