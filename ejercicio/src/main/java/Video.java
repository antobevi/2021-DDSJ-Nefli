public class Video {
  Integer idVideo;
  Integer minuteStop;

  public Video(Integer idVideo, Integer minuteStop) {
    this.idVideo = idVideo;
    this.minuteStop = minuteStop;
  }

  public Integer getIdVideo() {
    return idVideo;
  }

  public Integer getMinuteStop() {
    return minuteStop;
  }
}