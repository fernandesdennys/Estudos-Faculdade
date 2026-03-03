package unidade4.atividade2;

import java.util.Locale;
import java.util.Scanner;

public class ReativacaoCurta {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    double validos = entrada.nextDouble();
    double amostras = entrada.nextDouble();
   
    //AMOSTRA A:
    double porcent = (validos / (double) amostras) * 100.0;
    
    //AMOSTRA B:
    double razao = validos / (double) amostras;
    double porcentValido = razao * 100.0;

    entrada.close();
    System.out.println("entrada A: " + porcent + "e " + "entrada B: " + porcentValido);
  }
}

/* 
  Reativação curta
Problema-núcleo: o mesmo cálculo pode ser feito de formas diferentes.
Critério: escolher a abordagem mais verificável.
Evidência: justificar com clareza mais reduzir risco de erro silencioso.
Situação
Você tem duas maneiras de calcular percentual:

Abordagem A: double porcent = (validos / (double) amostras) * 100.0;
Abordagem B:
    - double razao = validos / (double) amostras;
    - double porcent = razao * 100.0;

Tarefa
Preencha a tabela de decisão abaixo escolhendo A ou B.

Critério	Minha escolha (A ou B)	Justificativa em 1 frase
  Escolha B.

Facilidade de depurar (encontrar erro)	
  Porque você pode inspecionar a variável razao isoladamente.

Clareza para outra pessoa ler	
  Porque separa o conceito de razão do conceito de percentual.

Risco de erro silencioso	
  Porque ambas fazem a mesma operação, mas B permite detectar erro intermediário.

Facilidade de testar com evidência
  Porque você pode testar a razão antes da multiplicação.
  
  */
