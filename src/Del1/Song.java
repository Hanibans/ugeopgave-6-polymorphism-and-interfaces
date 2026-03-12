package Del1;

public class Song extends MediaItem implements Playable {
    private String artist;

    public Song(String title, String artist, int durationSeconds) {
        super(title, durationSeconds);
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Afspiller: \"" + title + "\" af " + artist + " (" + formatDuration() + ")");
    }
}
