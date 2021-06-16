import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ContinueListener {
  List<Video> videos;

  public ContinueListener() {
    videos = new ArrayList<>();
  }

  public void onContinue(Integer idVideo) {
    if(videos.stream().anyMatch(video -> video.getIdVideo().equals(idVideo))) { // TODO: Abstraer logica repetida
      Video video = videos.stream().filter(unVideo -> unVideo.getIdVideo().equals(idVideo))
          .collect(Collectors.toList()).get(0);

      // TODO: Reproducir video desde el minuto pausado
      //reproductor.play(video.getIdVideo(), video.getMinuteStop());

      videos.remove(video);
    }
  }

  public List<Video> contenidosPendientesDeTerminar() {
    return videos;
  }

  public void agregarVideo(Video video) {
    videos.add(video);
  }
}