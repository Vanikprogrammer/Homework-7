package allpleers;

import javafx.scene.layout.Pane;

/**
 * Created by 1 on 02.08.2017.
 */
public abstract class PleerMP3 {
    protected final String PRISE;

    public PleerMP3(String prise){
        this.PRISE = prise;
    }

    public String getPrise() {
        return PRISE;
    }


}
