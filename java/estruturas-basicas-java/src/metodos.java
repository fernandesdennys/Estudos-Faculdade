public class metodos {
  public static void main(String[] args) {
    /* ativarSoneca(); */
    String mensagemDoAlarme = agendarAlarme(12, 30); //Argumentos
    System.out.println(mensagemDoAlarme);
  } 
  /**
   * Sintaxe do método de declaração de métodos no Java:
   * 
   * <tipo de retorno do método> identificador (<tipo>parâmetros) {
   * <bloco de comandos>
   * }
  */ 
  static void  ativarSoneca() {
    System.out.println("Só mais 5min");
  }

  static String agendarAlarme(int  hora, int minutos) { //Parâmetros
    // Seu  alarme foi configurado  às 12:30
    return "Seu  alarme foi configurado  às " + hora + ":" + minutos;
  }

}
