import java.util.HashMap;

public class App {
  public static void main(String[] args) throws Exception {
    var estudantes = new HashMap<String, String>();
    estudantes.put("x038702", "João");
    estudantes.put("x784244", "Maria");
    estudantes.put("x105852", "Joana");
    String valorAnterior = estudantes.put("x038702", "José"); // Mesma matricula usada no mapeamento com João
    System.out.println("Valor anterior de x038702: " + valorAnterior);
    System.out.println("Estudantes: " + estudantes);
    estudantes.remove("x038702");
    System.out.println(estudantes.get("x105852"));
    System.out.println(estudantes);

  }
}
