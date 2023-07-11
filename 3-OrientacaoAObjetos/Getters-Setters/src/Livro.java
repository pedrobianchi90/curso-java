public class Livro {

  private String titulo;
  private int numeroDePaginas;
  private String isbn;

  Livro (String tituloDoLivro, int numeroDePaginasDoLivro, String isbnDoLivro) {
    titulo = tituloDoLivro;
    numeroDePaginas = numeroDePaginasDoLivro;
    isbn = isbnDoLivro;
  }

   public String getTitulo() {
    return titulo;
  }

  public int getNumeroDePaginas() {
    return numeroDePaginas;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setNumeroDePaginas(int numeroDePaginas) {
    this.numeroDePaginas = numeroDePaginas;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }
}
