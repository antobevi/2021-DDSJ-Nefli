import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ContinueListener {
  List<Video> videos;

  public ContinueListener() {
    videos = new ArrayList<>();
  }

  public void onContinue(Integer idVideo) {
    Video video = this.videoPendienteDeTerminarSegun(idVideo);
    if(video != null) {
      /* Reproduce el video desde el minuto pausado, pero para esto deberia recibir el Reproductor por parametro.
         Como es el Reproductor el que tiene la "responsabilidad" de continuar la reproduccion, es el
         metodo continueSeeing el que se encarga de volver a reproducir el contenido de la siguiente manera
         en un objeto que implemente Reproductor:
      */
      // reproductor.play(video.getIdVideo(), video.getMinuteStop());

      videos.remove(video);
    }
  }

  public List<Video> contenidosPendientesDeTerminar() {
    return videos;
  }

  public void agregarVideo(Video video) {
    videos.add(video);
  }

  public Video videoPendienteDeTerminarSegun(Integer idVideo) {
    return videos.stream().filter(unVideo -> unVideo.getIdVideo().equals(idVideo))
        .collect(Collectors.toList()).get(0);
  }

}