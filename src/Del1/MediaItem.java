package Del1;

public abstract class MediaItem {
    protected String title; //Titlen på medieindholdet
    protected int durationSeconds; //Længden af mediet i sekunder

    //Konstruktør kaldes når man opretter et objekt af en underklasse
    public MediaItem(String title, int durationSeconds) {
        this.title = title;
        this.durationSeconds = durationSeconds;
    }

    //Getter for title
    public String getTitle() {
        return title;
    }

    //Getter for duration i sekunder
    public int getDurationSeconds() {
        return durationSeconds;
    }

    //Formaterer varigheden som "timer:minutter:sekunder"
    //fx 367 sekunder -> "6:07" eller 3670 sekunder -> "1:01:10"
    protected String formatDuration() {
        int hours = durationSeconds / 3600; //Beregn timer
        int minutes = (durationSeconds % 3600) / 60; //Beregn minutter (resten efter timer er fjernet)
        int sec = durationSeconds % 60; // Beregn sekunder (resten efter timer og minutter)

        //Hvis der er mindst én time, vis timer:minutter:sekunder
        if (hours > 0)
            return hours + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", sec);
            //%02d = altid 2 cifre, fylder med 0 hvis nødvendigt

        //Hvis ingen timer, vis kun minutter:sekunder
        return minutes + ":" + String.format("%02d", sec);
    }

    //toString() overskrives for at vise titlen og varigheden i sekunder
    @Override
    public String toString() {
        return title + " (" + durationSeconds + " sec)";
    }
}
