package unidade6;
import java.util.Scanner;

public class exemploWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Cria Um Scanner Para Ler Dados Digitados No Teclado

        System.out.print("Informe A Quantidade De Amostras (Maior Que Zero): "); // Solicita Um Numero Ao Usuario
        int amostras = entrada.nextInt(); // Le Um Inteiro Digitado

        while (amostras <= 0) { // Enquanto O Numero For Invalido (Zero Ou Negativo), Continua Repetindo
            System.out.print("Valor Invalido. Digite Novamente: "); // Informa O Erro E Pede Nova Tentativa
            amostras = entrada.nextInt(); // Le Novamente Para Alterar A Variavel E Permitir Que A Condicao Mude
        }

        System.out.println("Quantidade Valida Informada: " + amostras); // Exibe O Valor Aceito

        entrada.close(); // Fecha O Scanner Para Liberar O Recurso
    }
}