package exemple;
import bandeau.Bandeau;
import java.awt.Color;
import javax.swing.Timer;

public class EffetClignotant extends Effet{
    
    private int delai;


    public EffetClignotant(int delai){
        super();
        this.delai = delai;
    }
    
    public void appliquer(Bandeau bandeau){
        
        bandeau.setForeground(Color.RED);
        bandeau.sleep(delai);
        bandeau.setForeground(Color.BLACK);
        bandeau.sleep(delai);
}
}


