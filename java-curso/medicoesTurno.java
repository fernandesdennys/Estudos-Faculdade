import java.util.Scanner;

public class medicoesTurno {
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);

        int tempo;
        int soma = 0;
        int contador = 0;

        System.out.print("Digite um tempo (-1 para encerrar): ");
        tempo = scanner.nextInt();

        while (tempo != -1) { // O programa continuará executando enquanto o valor for diferente de -1
            if (tempo >= 0) { // Verificamos se o tempo é válido (maior ou igual a 0)
                soma = soma + tempo; // Somamos o tempo à variável soma                
                contador = contador + 1; // Aumentamos o contador de tempos válidos
            }
            System.out.print("Digite um tempo (-1 para encerrar): "); // Pedimos outro valor para continuar o loop
            tempo = scanner.nextInt();
        }

        // Quando o usuário digita -1, o while termina e chegamos aqui

        if (contador > 0) { // Verificamos se pelo menos um valor válido foi digitado            
            double media = (double) soma / contador; // Calculamos a média (convertendo para double para evitar divisão inteira)

            System.out.println("Quantidade de tempos válidos: " + contador);
            System.out.println("Soma dos tempos: " + soma);
            System.out.println("Média: " + media);
        } else {            
            System.out.println("Nenhum Tempo Valido");// Caso nenhum valor válido tenha sido informado
        }        
        scanner.close();
    }
}