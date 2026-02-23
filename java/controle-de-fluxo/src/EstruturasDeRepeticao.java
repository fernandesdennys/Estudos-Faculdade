/* 
// Estrutura 
for (atribyução; condilção; incremento) {
  // EXECUTA ESSE BLOCO
}

// Exemplo prático 
ArrayList<String> nomes = new ArrayList<>();
for (int i = 0; i <nomes.size(); i++) {
  System.out.println(nomes.get(i));
}
------------------------------------------------
Estrutura 
while (condição) {
// EXECUTA ESSE BLOCO
}

// Exemplplo prático
String opcao = " ";
while(!opcao.equals("sair")) {
  System.out.println("Opção desejada?")
//  Mostra opções
}
*/

import java.io.Console;
import java.util.ArrayList;

public class EstruturasDeRepeticao {
  public static void main(String[] args) {
    ArrayList<String> tarefas = new ArrayList<>();
    Console console = System.console();

    String adicionarNovaTarefa = "s";

    while(adicionarNovaTarefa.equals("s")) {
      System.out.println("Informe a tarefa:");
      String tarefa = console.readLine();
      tarefas.add(tarefa);

      System.out.println("Adicionar nova tarefa (s ou n )?");
      adicionarNovaTarefa = console.readLine();
    }
    // [ ] Tarefa 1
    // [ ] Tarefa 2
    System.out.println("\nSuas Tarefas:");
    for(int i = 0; i < tarefas.size(); i++) {
      System.out.println("[ ] " + tarefas.get(i));
    }
  }
}
