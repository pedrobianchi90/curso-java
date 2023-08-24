import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class App {
  public static void main(String[] args) {
    Collection<Automovel> automoveis = obterAutomoveis();

    List<String> paraRecall = automoveis.stream()
        .filter(e -> "Modelo A".equals(e.getModelo()))
        .filter(e -> e.getAnoDeFabricacao() >= 2015 && e.getAnoDeFabricacao() <= 2017)
        .map(auto -> auto.getChassi())
        .collect(Collectors.toList());

        paraRecall.forEach(System.out::println);
}

public static Collection<Automovel> obterAutomoveis() {
    return Set.of(
        new Automovel("Modelo A", 2015, "abcdef"),
        new Automovel("Modelo B", 2016, "ghijkl"),
        new Automovel("Modelo A", 2017, "klmno"),
        new Automovel("Modelo B", 2015, "pqrstu"),
        new Automovel("Modelo A", 2016, "vxwyza"),
        new Automovel("Modelo B", 2017, "aeioub"));
}

    // Collection<String> nomes = List.of("Fulano", "Maria", "Fulano", "José", "José", "Joana");
    // long pessoasDistintas = nomes.stream()
    //     .distinct()
    //     .count();
    // System.out.println(pessoasDistintas);

    // Stream.of("um", "dois", "três", "quatro")
    //     .filter(e -> e.length() > 3)
    //     .peek(e -> System.out.println("Valor filtrado: " + e))
    //     .map(String::toUpperCase)
    //     .peek(e -> System.out.println("Valor mapeado: " + e))
    //     .collect(Collectors.toList());

  }

