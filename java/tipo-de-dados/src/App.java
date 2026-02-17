public class App {
    public static void main(String[] args) {
        /*
        Tipos numéricos inteiros
        byte num1 = 1;
        short num2 = 10000;
        int num3 = 1000000000;
        long num4 = 100_000_000_000_00L;

        int numero1 = 10
        int numero2 = 20
        int soma = numero1 + numero2;
        */

       //Tipos decimais - float, double
       float numero1 = 1.5f;
       float numero2 = 1.5f;
       float soma = numero1 + numero2;
       System.out.println(soma);

       double numero3 = 2.5;
       double numero4 = 2.5;
       
       double soma2 = numero3 + numero4;
       System.out.println(soma2);

       double mult = numero3 * numero4;
       System.out.println(mult);

       double div = numero3 / numero4;
       System.out.println(div);

       double sub = numero3 - numero4;
       System.out.println(sub);

       
       // Char e boolean
       char operador = '+';

       double numero5 = 3.5;
       double numero6 = 6.5;

       double resultado = soma(4.6, 5.4 );
       System.out.println(operador + " : " + resultado);

       boolean ehIgual = numero5 == numero6;
       boolean ehMaior = numero5 < numero6;
       
       System.out.println(ehIgual);
       System.out.println(ehMaior);

       /**
        * Tipos promitivos:
        * Valores padão:
        * int = 0, fload = 0.0, doublers 0.0, boleas = false
        * 
        * Tipos de referência:
        * <TipoDaClasse> identificador = new TipoDaClasse();
        * valor padrão: null
       */

    Calculadora calculadora = new Calculadora(1.5, 3.5);
    Calculadora calculadora2 = new Calculadora(31.5, 37.5);
    Calculadora calculadora3 = new Calculadora(14.5, 1.5);

    System.out.println(calculadora.soma());
    System.out.println(calculadora2.soma());
    System.out.println(calculadora3.soma());
    System.out.println(calculadora.numero1.equals(calculadora2.numero2));
    System.out.println(calculadora.numero1.equals(calculadora3.numero2));

    }

    static double soma (double numero1, double numero2) {
        return numero1 + numero2;
    }
}


