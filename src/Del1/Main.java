package Del1;

public class Main {
    public static void main(String[] args) {
        //Opretter en ny MediaPlayer, som kan håndtere alle Playable objekter
        MediaPlayer player = new MediaPlayer();

        //Tilføjer Songs til playlisten
        //Song implementerer Playable og arver fra MediaItem
        player.add(new Song("Comfortably Numb", "Pink Floyd", 382));
        player.add(new Song("Paranoid Android", "Radiohead", 387));

        //Tilføjer Podcasts til playlisten
        //Podcast implementerer også Playable, så polymorfien gør, at vi kan tilføje dem på samme måde
        player.add(new Podcast("Lex Fridman #400", "Lex Fridman", 6137));
        player.add(new Podcast("Darknet Diaries", "Jack Rhysider", 4200));

        //Tilføjer Audiobooks til playlisten
        //Audiobook implementerer Playable, polymorfi igen
        player.add(new Audiobook("Dune", "Frank Herbert", 76440));
        player.add(new Audiobook("1984", "George Orwell", 39600));

        //Udskriver playlisten med index, titel og varighed
        //Her bruges formatDuration() fra MediaItem, selvom objekterne er forskellige klasser
        player.printPlaylist();

        System.out.println();

        //Afspil alle elementer i playlisten
        //Polymorfi: play() kaldes på hvert objekt, og Java vælger den rigtige play-metode for Song/Podcast/Audiobook
        player.playAll();

        //Beregn samlet varighed i sekunder
        int total = player.getTotalDuration();

        //Konverter sekunder til timer, minutter og sekunder
        int hours = total / 3600;
        int minutes = (total % 3600) / 60;
        int seconds = total % 60;

        // Udskriv samlet spilletid i format HH:MM:SS
        // String.format("%02d", ...) sørger for, at minutter og sekunder altid har to cifre
        System.out.println("\nSamlet spilletid: " + hours + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", seconds));
    }
}
