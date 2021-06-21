public class Video {
  Integer idVideo;
  Integer minuteStop;
  Integer duracion;

  public Video(Integer idVideo, Integer minuteStop) {
    this.idVideo = idVideo;
    this.minuteStop = minuteStop;
  }

  public Integer getDuracion() {
    return duracion;
  }

  public Integer getIdVideo() {
    return idVideo;
  }

  public Integer getMinuteStop() {
    return minuteStop;
  }

  public void setMinuteStop(Integer minuteStop) {
    this.minuteStop = minuteStop;
  }

  public Boolean estaPendiente() {
    return minuteStop != 0;
  }

  public void continuarViendo(Reproductor reproductor) {
    if(estaPendiente()) {
      reproductor.play(idVideo, minuteStop);
    }

    minuteStop = 0; // Para indicar que ya no esta pendiente
  }

}