public class ModificadorStatic {
  public static void main(String[] args) {
    //Static: 
    // 1. quando não precisa de objetos! 
    // 2. Constants 


  /*   Conta contaJoao = new Conta();
    Conta contaMaria = new Conta(); */

    Conta.depositarContaConjunta(100.0);
    /* contaMaria.depositarConta(100.0);
    contaJoao.depositarConta(500.0); */

    System.out.println(Conta.saldoContaConjunta);
   /*  System.out.println(contaJoao.saldo);
    System.out.println(contaMaria.saldo); */
    // System.out.println(Conta.TAXA_SERVICOS);

    Conta contaJoao = new Conta();
    contaJoao.depositarConta(251.65523);
    System.out.println(Math.floor(contaJoao.saldo)); // Arredonda para baixo
    System.out.println(Math.ceil(contaJoao.saldo)); // Arredonda para cima
    System.out.println(Math.round(contaJoao.saldo)); // Arredonda mais proximo inteiro
  }
  
}
