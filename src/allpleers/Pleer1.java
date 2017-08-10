package allpleers;

import allpleers.PleerMP3;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

/**
 * Created by 1 on 02.08.2017.
 */
public class Pleer1 extends PleerMP3 implements IPlaysong {


    public Pleer1(String prise) {
        super(prise);
    }

    @Override
    public void show(Pane root) {
        javafx.scene.control.Button button = new Button();
        button.setText("Play");
        button.setTranslateX(10);
        button.setTranslateY(20);
        Text text = new Text();
        text.setTranslateX(10);
        text.setTranslateY(40);
        button.setOnMouseClicked(event -> {
            text.setText("Playing" + IPlaysong.song);
        });
    }


    @Override
    public void playSong() {
        System.out.println("Playng: " + IPlaysong.song); //    проигрываем песенку
    }
}
