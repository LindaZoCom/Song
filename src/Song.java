public class Song {
    private String title;
    private String artist;
    private int durationSeconds;
    private MusicGenre genre;

    public Song(String title, String artist, int durationSeconds, MusicGenre genre) {
        setTitle(title);
        setArtist(artist);
        setDurationSeconds(durationSeconds);
        setGenre(genre);
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

    public MusicGenre getGenre() {
        return genre;
    }

    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Titel måste anges.");
        }

        this.title = title;
    }

    public void setArtist(String artist) {
        if (artist == null || artist.isBlank()) {
            throw new IllegalArgumentException("Artist måste anges.");
        }

        this.artist = artist;
    }

    public void setDurationSeconds(int durationSeconds) {
        if (durationSeconds <= 0) {
            throw new IllegalArgumentException(
                    "Längd måste vara större än 0 sekunder."
            );
        }

        this.durationSeconds = durationSeconds;
    }

    public void setGenre(MusicGenre genre) {
        if (genre == null) {
            throw new IllegalArgumentException("Genre måste anges.");
        }

        this.genre = genre;
    }

    public boolean isLongSong() {
        return durationSeconds >= 240;
    }

    @Override
    public String toString() {
        return title + " - " + artist
                + " (" + durationSeconds + " sekunder, " + genre + ")";
    }
}


