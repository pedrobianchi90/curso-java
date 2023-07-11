public class Carro {

  private String nome;
  private String montadora;
  private int ano;

  public Carro(String nomeCarro, String montadoraCarro, int anoCarro) {
    nome = nomeCarro;
    montadora = montadoraCarro;
    ano = anoCarro;
  }

  public String getNome() {
    return nome;
  }

  public String getMontadora() {
    return montadora;
  }

  public int getAno() {
    return ano;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setMontadora(String montadora) {
    this.montadora = montadora;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }
}