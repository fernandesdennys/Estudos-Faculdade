package atividade2;
public class SistemaDesconto {

    public static double calcularValorFinal(boolean premium, double valorCompra) {
        double desconto = 0;

        if (valorCompra >= 200) {
            if (premium) {
                desconto = 0.15; // 15%
            } else {
                desconto = 0.05; // 5%
            }
        }

        return valorCompra - (valorCompra * desconto);
    }

    public static void main(String[] args) {

        // Caso 1
        System.out.println("Caso 1 - Premium + 250");
        double resultado1 = calcularValorFinal(true, 250);
        System.out.println("Valor final: " + resultado1);
        System.out.println("-----------------------");

        // Caso 2
        System.out.println("Caso 2 - Não Premium + 250");
        double resultado2 = calcularValorFinal(false, 250);
        System.out.println("Valor final: " + resultado2);
        System.out.println("-----------------------");

        // Caso 3
        System.out.println("Caso 3 - Premium + 150");
        double resultado3 = calcularValorFinal(true, 150);
        System.out.println("Valor final: " + resultado3);
        System.out.println("-----------------------");

        // Caso 4
        System.out.println("Caso 4 - Não Premium + 150");
        double resultado4 = calcularValorFinal(false, 150);
        System.out.println("Valor final: " + resultado4);
    }
}
