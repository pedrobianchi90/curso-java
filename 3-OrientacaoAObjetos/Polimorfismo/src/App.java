public class App {

  public static void main(String[] args) {
    Carro carro = new Carro();
		carro.abastecer();
		carro.acelerar();
		
		Moto moto = new Moto();
		moto.abastecer();
		moto.acelerar();
    // moto.mostrar();

    Calculadora calc = new Calculadora();
		System.out.println("soma(int a, int b): " + calc.soma(3, 7));
		System.out.println("soma(int a, int b, int c): " + calc.soma(3, 7, 5));
		System.out.println("soma(double a, double b): " + calc.soma(3.5, 7.9));
  }
}