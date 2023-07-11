import java.lang.Math;

public class Avaliacao {
    public void calcularIMC(double peso, double altura) {
        double IMC = peso / Math.pow(altura, 2);
        System.out.println("Seu IMC é de " + IMC);
    }
    
}
