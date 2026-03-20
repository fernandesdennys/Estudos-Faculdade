package unidade7;

public class farmaciaHospitalar {
    public static void main(String[] args) {
        // Chamadas com diferentes "Argumentos"
        calcularDosagem("Antibiótico A", 70.5); 
        calcularDosagem("Analgésico B", 12.0);
    }

    // Método com dois parâmetros de tipos diferentes
    public static void calcularDosagem(String nomeMedicamento, double pesoPaciente) {
        double dosagemFinal = pesoPaciente * 0.5; // Regra fictícia de 0.5mg por kg
        System.out.println("Medicamento: " + nomeMedicamento);
        System.out.println("Dosagem recomendada: " + dosagemFinal + "mg");
        System.out.println("---------------------------------");
    }
}
