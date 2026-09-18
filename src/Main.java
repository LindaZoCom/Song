import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song(
                "Here Without You",
                "3 Doors Down",
                237
        ));

        songs.add(new Song(
                "That's So True",
                "YORRY",
                114
        ));

        songs.add(new Song(
                "Objects in the Rear View Mirror May Appear Closer Than They Are",
                "Meat Loaf",
                615
        ));

        songs.add(new Song(
                "How You Remind Me",
                "Nickelback",
                223
        ));
        System.out.println("Antal låtar: " + songs.size());
        System.out.println("\n=== Alla låtar ===");

        for (Song song : songs) {
            System.out.println(song);
        }

        System.out.println("\n=== Låtar som är minst fyra minuter ===");

        for (Song song : songs) {
            if (song.isLongSong()) {
                System.out.println(song);
            }
        }
        // Extra 1: Räkna total längd
        int totalSeconds = 0;

        for (Song song : songs) {
            totalSeconds += song.getDurationSeconds();
        }

        System.out.println("\nTotal längd: "
                + totalSeconds + " sekunder");

        // Extra 2: Hitta längsta låten
        Song longestSong = songs.get(0);

        for (Song song : songs) {
            if (song.getDurationSeconds()
                    > longestSong.getDurationSeconds()) {
                longestSong = song;
            }
        }

        System.out.println("Längsta låten: " + longestSong);

        // Extra 3: Skriv ut en numrerad lista
        System.out.println("\n=== Numrerad lista ===");

        for (int index = 0; index < songs.size(); index++) {
            System.out.println((index + 1) + ". "
                    + songs.get(index));
        }
    }
}



