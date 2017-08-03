/**
 * Created by 1 on 02.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Pleer1 pleer1 = new Pleer1("20");
        Pleer2 pleer2 = new Pleer2("40");
        Pleer3 pleer3 = new Pleer3("60");
        Pleer4 pleer4 = new Pleer4("80");
        Pleer5 pleer5 = new Pleer5("100");
        Pleer6 pleer6 = new Pleer6("120");


        System.out.println("Pleer 1");
        System.out.println(pleer1.getPrise());
        System.out.println(pleer1.song1);
        pleer1.playSong();
        System.out.println();

        System.out.println("Pleer 2");
        System.out.println(pleer2.getPrise());
        System.out.println(pleer2.song1);
        pleer2.playSong();
        System.out.println();

        System.out.println("Pleer 3");
        System.out.println(pleer3.getPrise());
        pleer3.playSong();
        pleer3.playAllSongs();
        System.out.println();

        System.out.println("Pleer 4");
        System.out.println(pleer4.getPrise());
        pleer4.playSong();
        pleer4.playAllSongs();
        System.out.println();

        System.out.println("Pleer 5");
        System.out.println(pleer5.getPrise());
        pleer5.playSong();
        pleer5.playAllSongs();
        System.out.println();

        System.out.println("Pleer 6");
        System.out.println(pleer6.getPrise());
        pleer6.playSong();
        pleer6.playAllSongs();
        System.out.println();
        pleer6.shuffle();
    }
}
