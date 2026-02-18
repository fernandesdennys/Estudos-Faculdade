package br.com.dennysfernandes.condominio;

public class Teste {
  public static void main(String[] args) {
    Piscina piscina = new Piscina();
    Apartamento apartamento = new Apartamento();
    System.out.println(piscina.getBoia());
    piscina.setBoia("Nova Boia");
  }
}
