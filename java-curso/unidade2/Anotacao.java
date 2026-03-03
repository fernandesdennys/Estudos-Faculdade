import java.util.Locale;

public class Anotacao {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
   /*  
    System.out.print(); não pula linha
    System.out.println(); pula linha
    System.out.printf(); permite formatação profissional     
    */
   double saldo = 1500.5;
   
   /* NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR")); */

   System.out.printf("Saldo: R$ %.2f", saldo);

  }
}
