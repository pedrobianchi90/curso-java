import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    System.out.println("Para finalizar essa compra, é necessário ser maior de idade. Informe seu ano de nascimento:");
    Scanner entrada = new Scanner(System.in);
    int ano = entrada.nextInt();

    try {
      ehMaiorDeIdade(ano);
      System.out.println("Compra confirmada");
    } catch (MenorDeIdadeException e) {
      System.out.println(e.getMessage());
    } finally {
      entrada.close();
    }

  }

  private static boolean ehMaiorDeIdade(int ano) throws MenorDeIdadeException {
    int idade = 2022 - ano;
    if (idade < 18) {
      throw new MenorDeIdadeException();
    } else {
      return true;
    }
  }
}