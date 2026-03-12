package Del1;

public class Podcast extends MediaItem implements Playable {
    private String host;

    public Podcast(String title, String host, int durationSeconds) {
        super(title, durationSeconds);
        this.host = host;
    }

    @Override
    public void play() {
        System.out.println("Afspiller podcast: \"" + title + "\" med " + host + " (" + formatDuration() + ")");
    }
}
