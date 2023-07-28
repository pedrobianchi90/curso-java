public class Conta {
  public String getNumeroDeConta(String contaFormatada) {
    return contaFormatada.replace('X', '0');
  }

  String transacao = "123.45MCAD"; // Informação recebida de outro sistema

  int separador = transacao.indexOf('M');
  double total = getTotal(transacao, separador - 1); // Retorna 123.45
  String moeda = getMoeda(transacao, separador + 1); // Retornar CAD

  String nomes = "Maria Magali, Magali da Silva, Magali Medeiros";
  String pessoa = "Laura";

  nomes = nomes.replaceAll("Magali",pessoa);

  System.out.println(nomes);
}

