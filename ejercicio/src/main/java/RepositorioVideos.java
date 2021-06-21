import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioVideos {
  private static final RepositorioVideos instance = new RepositorioVideos();
  public List<Video> videos;

  private RepositorioVideos() {
    this.videos = new ArrayList<>();
  }

  public static RepositorioVideos getInstance() {
    return instance;
  }

  public List<Video> getVideos() {
    return videos;
  }

  public void agregarVideo(Video video) {
    videos.add(video);
  }

  public List<Video> videosPendientes() { // Para listar los videos pendientes
    return videos.stream().filter(unVideo -> unVideo.estaPendiente()).collect(Collectors.toList());
  }

}