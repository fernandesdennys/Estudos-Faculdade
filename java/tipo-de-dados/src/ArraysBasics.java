import java.util.ArrayList;
/* import java.util.Arrays; */

public class ArraysBasics {
  public static void main(String[] args) {
    // Sintaxe ==> <tipo> [] identificador = {valores}
    /* String [] tarefas = {"Acordar", "Tomar café", "Escovar os dentes", "Lêr um livro", "Ir a academia"}; */

/*     String [] tarefas = new String[5];
    tarefas[0] = "Acordar";
    tarefas[1] = "Tomar café";
    tarefas[2] = "Escovar os dentes";
    tarefas[3] = "Lêr um livro";
    tarefas[4] = "Ir a academia";

    System.out.println(tarefas[0]);
    System.out.println(tarefas[1]);
    System.out.println(tarefas[2]);
    System.out.println(tarefas[3]);
    System.out.println(tarefas[4]);
    System.out.println(Arrays.toString(tarefas));
    System.out.println(tarefas.length);
 */

    ArrayList<String> tarefas = new ArrayList<>();
    tarefas.add("Acordar");
    tarefas.add("Tomar café");
    tarefas.add("Escovar os dentes");
    tarefas.add("Lêr um livro");
    tarefas.add("Ir a academia");

    System.out.println(tarefas);
    System.out.println(tarefas.size());
    System.out.println(tarefas.get(0));
  }
}
