public class Automovel {

  private String modelo;
  private Integer anoDeFabricacao;
  private String chassi;

  public Automovel() {
  }

  public String getChassi() {
    return chassi;
  }

  public void setChassi(String chassi) {
    this.chassi = chassi;
  }

  public Automovel(String modelo, Integer anoDeFabricacao, String chassi) {
    this.modelo = modelo;
    this.anoDeFabricacao = anoDeFabricacao;
    this.chassi = chassi;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public Integer getAnoDeFabricacao() {
    return anoDeFabricacao;
  }

  public void setAnoDeFabricacao(Integer anoDeFabricacao) {
    this.anoDeFabricacao = anoDeFabricacao;
  }

}
