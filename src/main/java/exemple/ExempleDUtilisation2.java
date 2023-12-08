package exemple;

import bandeau.Bandeau;

import java.awt.Color;
import java.awt.Font;

public class ExempleDUtilisation2 {
    
    public static void main(String[] args) {
        new ExempleDUtilisation2().exemple();
    }

    public void exemple() {
        Bandeau monBandeau2 = new Bandeau();

        Font font = monBandeau2.getFont();
        Color back = monBandeau2.getBackground();
        Color fore = monBandeau2.getForeground();


        monBandeau2.setMessage("Hello Sara");

        EffetClignotant ec = new EffetClignotant(500);
        EffetRotation er = new EffetRotation();
        EffetZoom ez = new EffetZoom();

        ScenarioAnimation scenario = new ScenarioAnimation();
        scenario.addEffect(ec, 3);
        scenario.addEffect(er, 3);
        scenario.addEffect(ez, 3);

        scenario.appliquer(monBandeau2);
        monBandeau2.close();
    }
}
