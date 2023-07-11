public class App {
  public static void main(String[] args) {
    Livro livro1 = new Livro(
        "Senhor dos Aneis",
        1232,
        "8533619626");

    System.out.println("O nome do livro é " + livro1.getTitulo());
    System.out.println("O número de páginas do livro é " + livro1.getNumeroDePaginas());
    System.out.println("O nome do isbn do livro é " + livro1.getIsbn());

    Carro objCarro = new Carro("Creta", "Hyundai", 2021);

    System.out.println("O nome do carro é: " + objCarro.getNome());
    System.out.println("A montadora do carro é: " + objCarro.getMontadora());
    System.out.println("O ano do carro é: " + objCarro.getAno());

    Calculadora objCalculadora = new Calculadora();

    objCalculadora.setPrimeiroNumero(10);
    objCalculadora.setSegundoNumero(7);

    System.out.println("Resultado da multiplicação é: " + objCalculadora.multiplicar());

  }
}
