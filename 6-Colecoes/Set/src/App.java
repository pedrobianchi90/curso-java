import java.util.HashSet;

public class App {
  public static void main(String[] args) {
    // var estudantes = new HashSet<>();
    // var adicionouJoao = estudantes.add("João");
    // var adicionouJoaoDeNovo = estudantes.add("João");
    // var adicionouMaria = estudantes.add("Maria");
    // System.out.println(String.format("adicionouJoao: %b", adicionouJoao));
    // System.out.println(String.format("adicionouJoaoDeNovo: %b",
    // adicionouJoaoDeNovo));
    // System.out.println(String.format("adicionouMaria: %b", adicionouMaria));

    var estudantes = new HashSet<>();
    estudantes.add("João");
    estudantes.add("Maria");
    System.out.println(estudantes);
    estudantes.remove("João");
    System.out.println(estudantes);
    System.out.println(estudantes.size());
    System.out.println(estudantes.contains("Maria"));
  }
}
