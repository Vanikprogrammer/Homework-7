/**
 * Created by 1 on 02.08.2017.
 */
public class Pleer5 extends Pleer3 {
    public Pleer5(String prise) {
        super(prise);
    }
    public void playAllSongs(){
        for(int i = playlist.length - 1; i >= 0; i--){
            System.out.println( i + "songs - " + playlist[i]);    // проигрываем все песни с конца плейлиста в начало
        }
    }
}
