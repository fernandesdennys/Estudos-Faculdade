package unidade6;
import java.util.Locale; // Importa A Classe Locale Para Definir O Padrao De Formatação (Ex.: Ponto Decimal)
import java.util.Scanner; // Importa A Classe Scanner Para Ler Dados Digitados Pelo Usuario

public class mediaTempoLaboratorio { // Declara A Classe Principal Do Programa
    public static void main(String[] args) { // Metodo Principal: Onde A Execução Do Programa Começa
        Locale.setDefault(Locale.US); // Define O Locale Como US Para Garantir Que O Separador Decimal Seja Ponto (.)
        Scanner entrada = new Scanner(System.in); // Cria O Scanner Para Ler Entradas Do Teclado

        System.out.print("Informe A Quantidade De Amostras: "); // Solicita Ao Usuario O Numero De Amostras
        int amostras = entrada.nextInt(); // Lê Um Inteiro Digitado E Armazena Na Variavel "amostras"

        while (amostras <= 0) { // Enquanto "amostras" For Menor Ou Igual A Zero, A Entrada É Invalida
            System.out.print("Valor Invalido. Digite Novamente: "); // Informa O Erro E Solicita Uma Nova Entrada
            amostras = entrada.nextInt(); // Lê Novamente Para Atualizar A Variavel E Permitir Que A Condição Mude
        }

        double somaTempo = 0.0; // Cria Um Acumulador Para Somar O Tempo De Todas As Amostras

        for (int i = 1; i <= amostras; i++) { // Repete De 1 Até O Número De Amostras Informado (Controle Por Contador)
            System.out.print("Tempo Da Amostra " + i + " (Minutos): "); // Solicita O Tempo Da Amostra Atual
            double tempo = entrada.nextDouble(); // Lê O Tempo Digitado Para A Amostra Atual

            while (tempo < 0) { // Enquanto O Tempo For Negativo, Considera A Entrada Invalida
                System.out.print("Tempo Invalido. Digite Novamente: "); // Informa O Erro E Solicita Novo Valor
                tempo = entrada.nextDouble(); // Lê Novamente Para Corrigir O Valor Do Tempo
            }

            somaTempo += tempo; // Soma O Tempo Valido No Acumulador Para Calcular A Média Ao Final
        }

        double media = somaTempo / amostras; // Calcula A Média Dividindo A Soma Total Pela Quantidade De Amostras
        System.out.println("Tempo Medio (Min): " + String.format("%.2f", media)); // Exibe A Média Formatada Com Duas Casas Decimais

        entrada.close(); // Fecha O Scanner Para Liberar O Recurso E Evitar Vazamento De Recursos
    }
}