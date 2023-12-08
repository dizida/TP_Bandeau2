package exemple;

import java.awt.Font;

import bandeau.Bandeau;

public class EffetZoom extends Effet{

    public EffetZoom(){
       super() ;
    }

    public void appliquer(Bandeau monBandeau){
        for (int i = 5; i < 60; i += 5) {
            monBandeau.setFont(new Font("Dialog", Font.BOLD, 20 + i));
            monBandeau.sleep(100);
        }
        for (int i = 5; i < 60; i += 5) {
            monBandeau.setFont(new Font("Dialog", Font.BOLD, 80 -i));
            monBandeau.sleep(100);
        }
    }

}
