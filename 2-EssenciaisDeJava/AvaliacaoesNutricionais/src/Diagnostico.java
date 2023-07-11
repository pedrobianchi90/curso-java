import java.util.Scanner;

public class Diagnostico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu peso?");
        String pesoString = scanner.next();

        System.out.println("Qual a sua altura?");
        String alturaString = scanner.next();

        double peso = Double.parseDouble(pesoString);
        double altura = Double.parseDouble(alturaString);

        Avaliacao avaliacao = new Avaliacao();
        avaliacao.calcularIMC(peso, altura);

        scanner.close();
    }
}
