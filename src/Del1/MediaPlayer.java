package Del1;
import java.util.ArrayList;

public class MediaPlayer {
    //Playlist er en liste over Playable objekter (interface)
    private ArrayList<Playable> playlist = new ArrayList<>();

    //Tilføj et Playable objekt til playlisten
    public void add(Playable item) {
        playlist.add(item);
    }

    //Afspil alle elementer i playlisten
    public void playAll() {
        for (Playable item : playlist) {
            //Polymorfi: det virker på alle Playable objekter
            item.play();
        }
    }

    //Beregn total varighed af alle elementer i playlisten
    public int getTotalDuration() {
        int total = 0;

        for (Playable item : playlist) {
            //Polymorfi: vi kalder getDurationSeconds() på alle Playable objekter
            total += item.getDurationSeconds();
        }

        return total;
    }

    //Print playlisten med index, titel og formateret varighed
    public void printPlaylist() {
        System.out.println("=== Playlist (" + playlist.size() + " elementer) ===");

        int index = 1;

        for (Playable item : playlist) {
            //Vi ved at alle Playable objekter i vores projekt også er MediaItem,
            //så vi kan caste til MediaItem for at få adgang til getTitle() og formatDuration()
            MediaItem media = (MediaItem) item;

            System.out.println(index + ". \"" + media.getTitle() + "\" - " + media.formatDuration());
            index++;
        }
    }
}
