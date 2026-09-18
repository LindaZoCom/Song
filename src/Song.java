public class Song {
    private String title;
    private String artist;
    private int durationSeconds;

    public Song(String title, String artist, int durationSeconds) {
        this.title = title;
        this.artist = artist;
        this.durationSeconds = durationSeconds;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(int durationSeconds) {
        if (durationSeconds > 0) {
            this.durationSeconds = durationSeconds;
        }
    }

    public boolean isLongSong() {
        return durationSeconds >= 240;
    }

    @Override
    public String toString() {
        return title + " - " + artist
                + " (" + durationSeconds + " sekunder)";
    }
}


