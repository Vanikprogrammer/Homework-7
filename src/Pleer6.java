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
        for (int i = playlist.length-1; i > 0; i--) {
            int j = r.nextInt(i+1);
            String temp = playlist[j];
            playlist[j] = playlist[i];
            playlist[i] = temp;                  // проигрываем песни в случайном порядке
        }
        for(String str:playlist){
            System.out.println(str);
        }
    }
}
