import java.text.NumberFormat;
import java.util.Locale;

public class Anotacao {
  public static void main(String[] args) {
   /*  
    System.out.print(); não pula linha
    System.out.println(); pula linha
    System.out.printf(); permite formatação profissional     
    */
   double saldo = 1500.5;
   
   NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
   System.out.println(nf.format(1500.5));
   System.out.printf("Saldo: R$ %.2f", saldo);

  }
}
