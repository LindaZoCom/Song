public class Main {
    public static void main(String[] args) {
        Song firstSong = new Song(
                "Espresso",
                "Sabrina Carpenter",
                175
        );

        Song secondSong = new Song(
                "Birds of a Feather",
                "Billie Eilish",
                211
        );

        firstSong.printInfo();
        secondSong.printInfo();

        System.out.println("Ursprunglig längd: "
                + firstSong.getDurationSeconds());

        firstSong.setDurationSeconds(160);
        System.out.println("Efter giltig ändring: "
                + firstSong.getDurationSeconds());

        firstSong.setDurationSeconds(-10);
        System.out.println("Efter ogiltig ändring: "
                + firstSong.getDurationSeconds());

        if (firstSong.isLongSong()) {
            System.out.println("Lång låt");
        } else {
            System.out.println("Kortare än fyra minuter");
        }



    }

}

