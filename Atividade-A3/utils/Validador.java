package utils;

public class Validador {

  public static String validarNome(String nome) {
    if (nome == null || nome.trim().isEmpty()) {
      throw new IllegalArgumentException("Nome não pode ser vazio.");
    }

    nome = nome.trim();

    if (nome.length() < 3) {
      throw new IllegalArgumentException("Nome deve ter pelo menos 3 caracteres.");
    }

    if (!nome.matches("^[A-Za-zÀ-ÿ ]+$")) {
      throw new IllegalArgumentException("Nome não pode conter números.");
    }

    return nome;
  }

  public static String validarMatricula(String matricula) {
    if (matricula == null || matricula.trim().isEmpty()) {
      throw new IllegalArgumentException("Matrícula não pode ser vazia.");
    }

    matricula = matricula.trim();

    if (!matricula.matches("^[A-Za-z0-9]{3,}$")) {
      throw new IllegalArgumentException("Matrícula inválida.");
    }

    return matricula;
  }

  // 🔥 AGORA: não aceita 0 nem negativo
  public static double validarValorPositivo(double valor, String campo) {
    if (valor <= 0) {
      throw new IllegalArgumentException(campo + " deve ser maior que zero.");
    }
    return valor;
  }

  public static int validarInteiroPositivo(int valor, String campo) {
    if (valor <= 0) {
      throw new IllegalArgumentException(campo + " deve ser maior que zero.");
    }
    return valor;
  }

  public static double validarPercentual(double valor) {
    if (valor <= 0 || valor > 100) {
      throw new IllegalArgumentException("Percentual deve ser entre 0 e 100.");
    }
    return valor;
  }
}