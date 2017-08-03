import java.util.Random;

/**
 * Created by 1 on 02.08.2017.
 */
public class Pleer6 extends Pleer3 {
    Random r = new Random(playlist.length);

    public Pleer6(String prise) {
        super(prise);
    }
    public void shuffle() {
        for (int i = 1; i < playlist.length; i++) {
            int j = r.nextInt(i);
            String temp = playlist[i];
            playlist[i] = playlist[j];
            playlist[j] = temp;
            System.out.println(i + "." + "song - " + playlist[i]);  // проигрываем песни в случайном порядке
        }
    }
}
