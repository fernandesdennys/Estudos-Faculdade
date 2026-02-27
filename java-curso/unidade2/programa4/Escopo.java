package programa4;

class Escopo {
  int idadeGlobal = 30; // escopo GLOBAL

  public static void main(String[] args) {
      int idadeLocal = 20;
      System.out.printf("Idade local é de: " +idadeLocal);
  }
}