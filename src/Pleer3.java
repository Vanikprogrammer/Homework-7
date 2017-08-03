/**
 * Created by 1 on 02.08.2017.
 */
public class Pleer3 extends Pleer1 {
    public String playlist[] = new String[]{song1, "Code Monkey", "And So You Code",
            "Bill Gates vs Steve Jobs", "Тыж Программист","Ставил Windows Программист"};

    public Pleer3(String prise) {
        super(prise);
    }
        public void playAllSongs(){
        for(int i = 0; i < playlist.length; i++){
            System.out.println(i + 1 + "song - " + playlist[i]);      // проигрываем весь плейлист
        }
    }
}
