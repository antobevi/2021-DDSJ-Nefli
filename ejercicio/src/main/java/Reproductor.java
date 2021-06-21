public interface Reproductor {

  boolean play(Integer idVideo, Integer minutoInicio);
  void stop();

  void registerOnPlay(PlayListener playListener);
  void registerOnStop(StopListener stopListener); // Al pausarlo se crea una instancia Video y se guarda en RepositorioVideos
  void registerOnFinish(FinishListener listener);

}