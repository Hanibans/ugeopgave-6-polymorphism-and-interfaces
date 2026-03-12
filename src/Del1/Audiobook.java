package Del1;

public class Audiobook extends MediaItem implements Playable {
    private String author;

    Audiobook(String title, String author, int durationSeconds) {
        super(title, durationSeconds);
        this.author = author;
    }

    @Override
    public void play() {
        System.out.println("Afspiller lydbog: \"" + title + "\" af " + author + " (" + formatDuration() + ")");
    }
}
