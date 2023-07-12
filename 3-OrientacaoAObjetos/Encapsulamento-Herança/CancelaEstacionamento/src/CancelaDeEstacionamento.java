import java.time.LocalTime;

public class CancelaDeEstacionamento {

  public boolean ehHorarioComerical() {
    LocalTime inicioDoDia = LocalTime.of(8, 0);
    LocalTime fimDoDia = LocalTime.of(18, 8);
    LocalTime agora = LocalTime.now();

    return agora.isAfter(inicioDoDia)
        && agora.isBefore(fimDoDia);
  }
}
