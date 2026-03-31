package unidade8;

import java.util.Locale;
import java.util.Scanner;

//id_familia | renda_per_capita | num_dependentes | possui_deficiencia | tempo_desempregado_meses | bairro_risco | prooridade_atual
/* 
F001                320.00              3                   sim                      8                  alto             ###
F002                540.00              1                   não                      2                  baixo            ###
F003                290.00              2                   não                      14                 médio            ###
F004                410.00              4                   sim                      1                  alto             ###
F005                380.00              0                   não                      10                 médio            ###
*/

/*
entrada = idFamilia

renda < 540
renda > 290

numDependentes > 0
numDependentes < 4

deficiencia = sim || nao

tempoDesempregado > 1
tempoDesempregado < 14

riscoDoBairro = baixo || medio || alto

achar a prioridade....
*/

public class cadastroFamiliar {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    
    int prioridade = 0; 

    if (prioridade == 100 || prioridade == 80) {
    System.out.println("Alta prioridade");
} else if (prioridade == 70 || prioridade == 50) {
    System.out.println("Média prioridade");
} else if (prioridade < 40) {
    System.out.println("Baixa prioridade");
}
    
    System.out.println("Digite o ID da família:");
    String idFamilia = entrada.next();

    System.out.println("Digite a renda per capita:");
    double renda = entrada.nextDouble();
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
    String deficiencia = entrada.next();
    if (deficiencia.equals("sim")) {
      prioridade += 15;
    } else {
      prioridade += 8;
    }

    System.out.println("Digite o tempo de desemprego em meses:");
    int tempoDesempregado = entrada.nextInt();
    if(tempoDesempregado <= 14 && tempoDesempregado >= 12) {
      prioridade += 20;
    } else if (tempoDesempregado > 10 && tempoDesempregado < 11) {
      prioridade += 15;
    } else {
      prioridade += 8;
    }

    System.out.println("O bairro é de risco? (sim/nao):");
    String riscoDoBairro = entrada.next();
    if (riscoDoBairro.equals("sim")) {
      prioridade += 25;
    } else {
      prioridade += 10;
    }

    System.out.println("\n===== RESULTADO =====");
    System.out.println("ID da família: " + idFamilia);
    System.out.println("Prioridade: " + prioridade);
    System.out.println("Dependentes: " + numDependentes);
    System.out.println("Deficiência: " + deficiencia);
    System.out.println("Desemprego (meses): " + tempoDesempregado);
    System.out.println("Bairro de risco: " + riscoDoBairro);


    entrada.close();
  }
}
