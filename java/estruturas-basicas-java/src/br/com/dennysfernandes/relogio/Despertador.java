package br.com.dennysfernandes.relogio;
public class Despertador {
  int hora;
  int minutos;
  int soneca;

  void  ativarSoneca() {
    // Só mias .... minutos
    System.out.println("Só mais" + soneca + "minutos");
  }

  String agendarAlarme() {
    // Seu  alarme foi configurado  às 12:30
    return "Seu  alarme foi configurado  às " + hora + ":" + minutos;
}
}