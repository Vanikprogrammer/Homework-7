/**
 * Created by 1 on 02.08.2017.
 */
public class Pleer4 extends Pleer3 {
    public Pleer4(String prise) {
        super(prise);
    }
    @Override
    public void playSong() {
        System.out.println("Последняя песня - " + playlist[playlist.length - 1]);   // проигрываем последнюю песню
    }
}
