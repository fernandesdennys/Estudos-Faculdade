package unidade6;
import java.util.Scanner;

public class exemploFor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Cria Um Scanner Para Ler Dados Digitados No Teclado

        int quantidade = 5; // Define Quantas Repeticoes Serao Feitas (Numero Conhecido)
        double soma = 0.0; // Cria Um Acumulador Para Somar Os Valores Digitados

        for (int i = 1; i <= quantidade; i++) { // Inicia i Em 1, Repete Ate i Chegar Em 5, Incrementa i A Cada Volta
            System.out.print("Digite O Valor " + i + ": "); // Solicita Um Valor Ao Usuario
            double valor = entrada.nextDouble(); // Le O Valor Digitado Como double
            soma += valor; // Soma O Valor Digitado Ao Total
        }

        System.out.println("Soma Dos Valores: " + soma); // Exibe A Soma Final

        entrada.close(); // Fecha O Scanner Para Liberar O Recurso
    }
}
