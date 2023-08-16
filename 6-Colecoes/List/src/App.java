import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Collections;
// import java.util.List;

public class App {
      public static void main(String[] args) {
		// var numeros = new ArrayList<Integer>();
		// numeros.add(7);
		// numeros.add(2);
		// numeros.add(1);
		// numeros.add(9);
		// System.out.println(numeros);
    // Collections.sort(numeros);
    // System.out.println(numeros);
    // numeros.add(3);
		// System.out.println(numeros);

    var estudantes = new ArrayList<String>(Arrays.asList("João", "Maria", "Pedro", "Rosa"));
    System.out.println(estudantes);
    estudantes.remove(1);
    System.out.println(estudantes);
    estudantes.remove("Pedro");
    System.out.println(estudantes);
    estudantes.add("Joana");
    System.out.println(estudantes);
    System.out.println(estudantes.size());
    System.out.println(estudantes.contains("João"));
    // var estudantes = List.of("João", "Maria", "Pedro", "Rosa");
	}
}
