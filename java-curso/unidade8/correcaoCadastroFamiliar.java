package unidade8;
import java.util.Locale;
import java.util.Scanner;

public class correcaoCadastroFamiliar {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    
    int prioridade = 0; 

    // ✅ Entrada de dados
    System.out.println("Digite o ID da família:");
    String idFamilia = entrada.next();

    System.out.println("Digite a renda per capita:");
    double renda = entrada.nextDouble();

    // ✅ Melhorado: simplificado (sem 20+5)
    if(renda < 290.00 ) {
      prioridade += 25;
    } else {
      prioridade += 10;
    }

    System.out.println("Digite o número de dependentes:");
    int numDependentes = entrada.nextInt();

    if(numDependentes >= 4) {
      prioridade += 30;
    } else {
      prioridade += 10;
    }

    System.out.println("Possui pessoa com deficiência? (sim/nao):");
    String deficiencia = entrada.next().toLowerCase(); // ✅ evita erro de digitação

    if (deficiencia.equals("sim")) {
      prioridade += 15;
    } else {
      prioridade += 8;
    }

    System.out.println("Digite o tempo de desemprego em meses:");
    int tempoDesempregado = entrada.nextInt();

    // ✅ Corrigido: agora as condições fazem sentido
    if(tempoDesempregado >= 12) {
      prioridade += 20;
    } else if (tempoDesempregado >= 6) {
      prioridade += 15;
    } else {
      prioridade += 8;
    }

    System.out.println("Digite o risco do bairro (alto/medio/baixo):");
    String riscoDoBairro = entrada.next().toLowerCase();

    // ✅ Corrigido: agora segue o enunciado (alto / médio / baixo)
    switch (riscoDoBairro) {
      case "alto":
        prioridade += 25;
        break;
      case "medio":
        prioridade += 15;
        break;
      case "baixo":
        prioridade += 5;
        break;
      default:
        System.out.println("Valor de bairro inválido");
        break;
    }

    // ✅ Cálculo já foi feito, podemos classificar
    String classificacao;

    if (prioridade >= 80) {
      classificacao = "Alta prioridade";
    } else if (prioridade >= 50) {
      classificacao = "Média prioridade";
    } else {
      classificacao = "Baixa prioridade";
    }

    // ✅ Saída organizada
    System.out.println("\n===== RESULTADO =====");
    System.out.println("ID da família: " + idFamilia);
    System.out.println("Prioridade (pontuação): " + prioridade);
    System.out.println("Classificação: " + classificacao);
    System.out.println("Dependentes: " + numDependentes);
    System.out.println("Deficiência: " + deficiencia);
    System.out.println("Desemprego (meses): " + tempoDesempregado);
    System.out.println("Bairro de risco: " + riscoDoBairro);

    entrada.close();
  }
}
