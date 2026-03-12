package unidade6;
import java.util.Scanner;

public class somaMediaMaiorMenor {
    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in); 

        double soma = 0.0; // Variável acumuladora que vai guardar a soma de todos os números

        double maior = Double.NEGATIVE_INFINITY; 
        // Inicializa a variável "maior" com o menor valor possível
        // Assim qualquer número digitado será maior que ele
        double menor = Double.POSITIVE_INFINITY; 
        // Inicializa a variável "menor" com o maior valor possível
        // Assim qualquer número digitado será menor que ele
        System.out.print("Quantos valores deseja informar? ");

        int n = entrada.nextInt(); // Lê a quantidade de números que serão digitados

        // ESTRUTURA DE REPETIÇÃO QUE EXECUTA N VEZES
        for (int i = 1; i <= n; i++) {
            System.out.print("Informe o valor " + i + ": "); // Mostra qual número o usuário está digitando
            double valor = entrada.nextDouble(); // Lê o número digitado
            soma += valor; // Soma o valor digitado na variável soma (é o mesmo que: soma = soma + valor)

            // Verifica se o valor digitado é maior que o maior atual
            if (valor > maior) {
                maior = valor; 
                // Se for maior, atualiza a variável maior
            }

            // Verifica se o valor digitado é menor que o menor atual
            if (valor < menor) {
                menor = valor; 
                // Se for menor, atualiza a variável menor
            }
        }

        double media = soma / n; // Calcula a média dividindo a soma pela quantidade de números

        System.out.println("Soma: " + String.format("%.2f", soma)); // Mostra a soma formatada com 2 casas decimais
        System.out.println("Media: " + String.format("%.2f", media)); // Mostra a média formatada com 2 casas decimais
        System.out.println("Maior: " + String.format("%.2f", maior)); // Mostra o maior valor digitado
        System.out.println("Menor: " + String.format("%.2f", menor)); // Mostra o menor valor digitado

        entrada.close(); // Fecha o Scanner para liberar recursos do sistema
    }
}