public class For {
  public static void main(String[] args) {

    // int numero;
    // String log;

    // // Leia como: PARA numero = 1, contanto que numero <= 10, faça o loop e depois
    // // faça numero += 1!
    // for (numero = 1; numero <= 10; numero += 1) {
    //   log = "O Número atual é: " + numero + "\n";
    //   System.out.println(log);
    // }

    // Cria um vetor com 4 alunos
    String[] alunos = { "MARCOS", "ALINE", "LUCAS", "PATRICIA" };
    String log;

    // Pega o total de alunos existentes no vetor
    int totalAlunos = alunos.length;

    // Nossa variável 'log' não é muito útil agora, mas serve para registrarmos o
    // que está acontecendo! ✌️
    log = "A lista de chamadas possui " + totalAlunos + " alunos \n";

    // Imprime a lista de chamadas. Note que você pode declarar a variável posição
    // dentro do for!
    int matricula;
    for (int posicao = 0; posicao < totalAlunos; posicao++) {
      matricula = posicao + 1;
      log = "Matricula: " + matricula + " Aluno: " + alunos[posicao] + "\n";
      System.out.println(log);
    }

  }

}
