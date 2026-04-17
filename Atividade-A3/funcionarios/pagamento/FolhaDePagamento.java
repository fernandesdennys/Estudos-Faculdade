package funcionarios.pagamento;

public abstract class FolhaDePagamento {
  private static long contador=1;
  private long id;
  private String nome;
  private String matricula;
  protected static final double salarioBase = 2000.0;
  
  public FolhaDePagamento() {
    this.id = contador++;
  }

  public FolhaDePagamento(String nome, String matricula) {
    this.id = contador++;
    this.nome = nome;
    this.matricula = matricula;
  }

  public static long getContador() {
    return contador;
  }

  public static void setContador(long contador) {
    FolhaDePagamento.contador = contador;
  }

  public long getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public double getsalarioBase() {
    return salarioBase;
  }

  public abstract double calcularSalarioFinal();


  @Override
  public String toString() {
    return "ID: " + id + 
    "\nNome: " +  nome +
    "\nMatricula: " + matricula +
    "\nSalarioFixo: " + salarioBase +
    "\nSalarioFinal: " + calcularSalarioFinal();
  }
}
