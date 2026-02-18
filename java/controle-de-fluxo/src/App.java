import java.io.Console;
import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        /* Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String name = scanner.nextLine();
        System.out.println("Olá " + name);
        System.out.println("Quantos anos voce tem ? ");
        String idade = scanner.nextLine();
        System.out.println("Voçe tem: " + idade + " anos");        
        scanner.close(); */
        Console console = System.console();
        System.out.println("Qual é o seu filme preferido?");
        String name = console.readLine();
        System.out.println(name + ", Hum! Ótima escolha.");
    }
}
