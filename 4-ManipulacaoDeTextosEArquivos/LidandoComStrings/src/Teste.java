public class Teste {
  String saudacao = "Olá, Mundo"
  String lorem = "Lorem ipsum dolor sit amet";
  String verso = "Um Anel para a todos governar, Um Anel para encontrá-los";

  System.out.println(verso.indexOf("governar"));

  System.out.println(saudacao.indexOf('M'));
  System.out.println(lorem.indexOf('s', 10));

  String casasTexto = "Grifinória;Sonseria;Corvinal;Lufa-Lufa";
  String casas[] = casasTexto.split(";");

for (String casa : casas)
  System.out.println(casa);

  String casasTexto = "Grifinória123Sonseria456Corvinal789Lufa-Lufa";
  String casas[] = casasTexto.split("\\d+");

for (String casa : casas)
  System.out.println(casa);String frase = "caneta,lápis,lapiseira,caderno,borracha";
  String formatado[] = frase.split(",", 3);
  
for (String novo_formato : formatado)
    System.out.println(novo_formato); // imprime ["caneta", "lápis", "lapiseira,caderno,borracha"]

    String fruta = "jabuticaba";
    System.out.println(fruta.toUpperCase());
    System.out.println(fruta);
}