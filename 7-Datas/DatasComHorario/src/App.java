import java.time.Clock;
import java.time.LocalDateTime;

public class App {

  public static void main(String[] args) throws Exception {
    Clock relogio = Clock.systemDefaultZone();
    System.out.println(relogio.instant());
    System.out.println(relogio);

    LocalDateTime now = LocalDateTime.now();
    System.out.println(now);

    LocalDateTime diaDoAniversario = LocalDateTime.parse("1990-05-08T07:10:00");
    System.out.print(diaDoAniversario);

    Academia agenda = new Academia();
    agenda.verificarDiaAcademia();
  }
}
