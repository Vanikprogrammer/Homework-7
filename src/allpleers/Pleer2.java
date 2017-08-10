package allpleers;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

/**
 * Created by 1 on 02.08.2017.
 */
public class Pleer2 extends Pleer1 {

    public Pleer2(String prise) {
        super(prise);
    }
    @Override
    public void playSong() {
        System.out.println("error");    // при проигрывании песни выдает ошибку
    }

    @Override
    public void show(Pane root) {
        super.show(root);
        javafx.scene.control.Button button = new Button();
        button.setText("Play");
        button.setTranslateX(10);
        button.setTranslateY(20);
        Text text = new Text();
        text.setTranslateX(10);
        text.setTranslateY(40);
        button.setOnMouseClicked(event -> {
            text.setText("error");
        });
    }
}
