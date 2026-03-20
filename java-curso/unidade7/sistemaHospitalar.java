package unidade7;

public class sistemaHospitalar {
  public static void main(String[] args) {
    exibirAlerta();
    System.out.println("Monitorando Sinais");
    exibirAlerta();
  }
  public static void exibirAlerta() {
    System.out.println("---ALERTA DE SEGURANÇA---");
    System.out.println("Verificar integridade do sensor!");
  }
}
