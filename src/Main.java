import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song(
                "Will You Remember Me",
                "One Matt Union",
                317, MusicGenre.ROCK
        ));
        songs.add(new Song(
                "Here Without You",
                "3 Doors Down",
                237, MusicGenre.ROCK
        ));

        songs.add(new Song(
                "That's So True",
                "YORRY",
                114, MusicGenre.DANCE
        ));

        songs.add(new Song(
                "Objects in the Rear View Mirror May Appear Closer Than They Are",
                "Meat Loaf",
                615, MusicGenre.ROCK
        ));

        songs.add(new Song(
                "How You Remind Me",
                "Nickelback",
                223, MusicGenre.ROCK
        ));
        songs.add(new Song(
                "Blinding Lights",
                "The Weeknd",
                200,
                MusicGenre.POP
        ));

        songs.add(new Song(
                "Levitating",
                "Dua Lipa",
                203,
                MusicGenre.POP
        ));

        songs.add(new Song(
                "Don't You Worry Child",
                "Swedish House Mafia",
                213,
                MusicGenre.DANCE
        ));

        songs.add(new Song(
                "One More Time",
                "Daft Punk",
                320,
                MusicGenre.ELECTRONIC
        ));

        songs.add(new Song(
                "Lose Yourself",
                "Eminem",
                326,
                MusicGenre.HIP_HOP
        ));

        songs.add(new Song(
                "Take Five",
                "Dave Brubeck",
                324,
                MusicGenre.JAZZ
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

        System.out.println("\n=== Rock ===");
        for (Song song : songs) {
            if (song.getGenre() == MusicGenre.ROCK) {
                System.out.println(song);
            }
        }

        System.out.println("\n=== Dance ===");
        for (Song song : songs) {
            if (song.getGenre() == MusicGenre.DANCE) {
                System.out.println(song);
            }
        }

        System.out.println("\n=== Pop ===");
        for (Song song : songs) {
            if (song.getGenre() == MusicGenre.POP) {
                System.out.println(song);
            }
        }
        System.out.println("\n=== HipHop ===");
        for (Song song : songs) {
            if (song.getGenre() == MusicGenre.HIP_HOP) {
                System.out.println(song);
            }
        }
        System.out.println("\n=== Electronic ===");
        for (Song song : songs) {
            if (song.getGenre() == MusicGenre.ELECTRONIC) {
                System.out.println(song);
            }
        }
        System.out.println("\n=== Jazz ===");
        for (Song song : songs) {
            if (song.getGenre() == MusicGenre.JAZZ) {
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

        try {
            Song invalidSong = new Song(
                    "",  //Title får inte vara tom
                    "Okänd artist", //Artist får inte vara okänd
                    -20, //Duration får inte vara mindre än 0
                    MusicGenre.POP
            );

            System.out.println(invalidSong);
        } catch (IllegalArgumentException exception) {
            System.out.println(
                    "\nKunde inte skapa låt: " + exception.getMessage()
            );
        }
    }
}



