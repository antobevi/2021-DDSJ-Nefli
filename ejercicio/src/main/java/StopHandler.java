import java.util.Optional;

public class StopHandler implements StopListener {

  public void onStop(Integer idVideo, Integer minutoActual) {
    Video video = RepositorioVideos.getInstance().getVideos()
        .stream().filter(unVideo -> unVideo.getIdVideo().equals(idVideo)).findAny().get();

    video.setMinuteStop(minutoActual);

    /*
    Video video = (Video) RepositorioVideos.getInstance().getVideos()
        .stream().filter(unVideo -> unVideo.getIdVideo().equals(idVideo)); Castear asi es valido?
    */
  }

}
