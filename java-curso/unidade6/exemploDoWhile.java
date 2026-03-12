package unidade6;

import java.util.Scanner;

public class exemploDoWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Cria Um Scanner Para Ler Dados Digitados No Teclado

        double ph; // Declara A Variavel Fora Do Laço Para Usa-la Na Condicao Do While

        do {
            System.out.print("Informe O pH (Entre 0 E 14): "); // Pede Um Valor Ao Usuario (Executa Pelo Menos Uma Vez)
            ph = entrada.nextDouble(); // Le O Valor Digitado
        } while (ph < 0 || ph > 14); // So Depois De Ler, Verifica Se O Valor Esta Fora Do Intervalo

        System.out.println("pH Valido Informado: " + ph); // Exibe O Valor Aceito

        entrada.close(); // Fecha O Scanner Para Liberar O Recurso
    }
}