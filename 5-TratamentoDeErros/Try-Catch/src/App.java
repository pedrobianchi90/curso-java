
// import java.util.Scanner;
import java.util.Optional;

public class App {

  public static void main(String[] args) {
    // try {
    // Integer resultadoExcecao = 2 / 0;
    // Integer resultado = 2 / 2 ;
    // System.out.println("Será que deu certo?");
    // System.out.println(resultado);
    // System.out.println(resultadoExcecao);

    // int[] numeros = new int[10];

    // numeros[15] = 10;

    // System.out.println(numeros);
    // } catch (ArithmeticException e) {
    // System.out.println("Ops! Não é possível realizer divisão por 0");
    // } catch (ArrayIndexOutOfBoundsException e) {
    // System.out.println("Ops, essa posição não existe!");
    // }

    // Pessoa p1 = new Pessoa("Joe");
    // System.out.println(p1.getNome());

    // try {
    // printLength(null);
    // } catch (NullPointerException e) {
    // System.out.println("Não foi possível obter o comprimento da palavra: " +
    // e.getMessage());
    // }

    // }
    // public static void printLength(String palavra) {
    // System.out.println(palavra.length());

    // int[] numeros = new int[10];
    // Scanner entrada = new Scanner(System.in);
    // try {
    // System.out.println("Digite um número de índice que você quer acessar: ");
    // int indice = entrada.nextInt();

    // numeros[indice] = 10; // essa linha pode lançar a
    // ArrayIndexOutOfBoundsException

    // numeros[indice] = 2 / 0; // essa linha irá lançar a ArithmeticException
    // System.out.println(numeros);
    // } catch (ArrayIndexOutOfBoundsException e ) {
    // System.out.println("Ops, essa posição não existe!");
    // } catch (ArithmeticException e ) {
    // System.out.println("Ops, não é possível dividir por 0");
    // }

    // entrada.close();

    Pessoa pessoa = new Pessoa("Bob");
    Optional<Pessoa> optional = Optional.ofNullable(pessoa);
    if (optional.isPresent()) {
      System.out.println("Pessoa existe");
    } else {
      System.out.println("Pessoa não existe");
    }
  }
}