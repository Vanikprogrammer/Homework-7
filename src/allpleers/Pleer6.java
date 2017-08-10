package allpleers;

import java.util.Random;

/**
 * Created by 1 on 02.08.2017.
 */
public class Pleer6 extends Pleer3 {

    public Pleer6(String prise) {
        super(prise);
    }

    public void shuffle() {
        Random r = new Random(IAllSong.playlist.length);
        for (int i = IAllSong.playlist.length-1; i > 0; i--) {
            int j = r.nextInt(i+1);
            String temp = IAllSong.playlist[j];
            IAllSong.playlist[j] = IAllSong.playlist[i];
            IAllSong.playlist[i] = temp;                  // перемешиваем песни
        }

        for(String str: IAllSong.playlist){
            System.out.println(str);
        }
    }
}
