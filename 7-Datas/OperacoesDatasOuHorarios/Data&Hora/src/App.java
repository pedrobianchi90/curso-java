public class App {
  public static void main(String[] args) throws Exception {
    AlertaAniversario alerta = new AlertaAniversario();
    alerta.checarAniversario();

    PontoEletronico ponto = new PontoEletronico();
		ponto.marcarHoraExtra();

    IdadeEmDias idade = new IdadeEmDias();
		System.out.println("A quantidade de dias desde o seu nascimento é: " + idade.calcularIdadeEmDias("1990-05-08T12:45:00"));
  }
}
