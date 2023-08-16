public class MenorDeIdadeException extends Exception {

  public MenorDeIdadeException() {
    super("Pessoa menor de 18 anos! Operação não permitida");
  }
}