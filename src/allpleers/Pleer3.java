package allpleers;

import allpleers.PleerMP3;

/**
 * Created by 1 on 02.08.2017.
 */
public class Pleer3 extends PleerMP3 implements IAllSong {


    public Pleer3(String prise) {
        super(prise);
    }

    @Override
    public void playSong() {
        System.out.println("Plaing - " + IAllSong.playlist[0]);       // проигрываем первую песню
    }

    @Override
    public void playAllSongs() {
        for (int i = 0; i < IAllSong.playlist.length; i++) {
            System.out.println(i + 1 + "song - " + IAllSong.playlist[i]);   //  проигрываем весь плейлист
        }
    }
}
