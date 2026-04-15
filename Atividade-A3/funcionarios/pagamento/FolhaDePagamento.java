package funcionarios.pagamento;

public abstract class FolhaDePagamento {
  private static long contador=1;
  private long id;
  private String nome;
  private String matricula;
  private double salarioFixo;
  
  public FolhaDePagamento() {
    this.id = contador++;
  }

  public FolhaDePagamento(long id, String nome, String matricula, double salarioFixo) {
    this.id = id;
    this.nome = nome;
    this.matricula = matricula;
    this.salarioFixo = salarioFixo;
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

  public double getSalarioFixo() {
    return salarioFixo;
  }

  public void setSalarioFixo(double salarioFixo) {
    this.salarioFixo = salarioFixo;
  }

  public abstract double calcularSalarioFinal();


  @Override
  public String toString() {
    return "ID: " + id + 
    "\nNome: " +  nome +
    "\nMatricula: " + matricula +
    "\nSalarioFixo: " + salarioFixo +
    "\nSalarioFinal: " + calcularSalarioFinal();
  }
}
