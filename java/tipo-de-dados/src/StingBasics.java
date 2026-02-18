public class StingBasics {
  public static void main(String[] args) {
    String str1 = new String("Java");
    String str2 = new String("Java");
    //FALSE
    System.out.println(str1 == str2);

    
    String str3 = "Java";
    String str4 = "Java";    
    //TRUE (Está armazenado no POOL DE STRINGS)
    System.out.println(str3 == str4);
    System.out.println("\nJAVA\tJAVA");

    String nome = "Dennys Fernandes";
    System.out.println("Primeira letra do nome: " + nome.charAt(0));

    //Posição de um caractere
    System.out.println("Posição da letra D do NOME " + nome.indexOf("F"));

    //Sobrenome da pessoa
    int posicaoSobrenome = nome.indexOf(" ") + 1;
    System.out.println("Sobrenome: " + nome.substring(posicaoSobrenome));
    System.out.println("Sobrenome: " + nome.substring(posicaoSobrenome, posicaoSobrenome + 1));
    System.out.println("Numero de caracteres no nome: " + nome.length());
    System.out.println("Numero de caracteres no nome: " + (nome.length() - 1)); // Eliminar o Espaço e contar somente as letras

    // Substituição de caractéres
    System.err.println(nome.replaceAll("e",  "3"));
    System.out.println(nome);

    // Concatenação
    String primeiroNome = "Dennys";
    String sobreNome = "Fernandes";

    System.out.println(primeiroNome +  " " + sobreNome);
  }
}
