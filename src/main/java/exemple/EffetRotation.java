package exemple;

import bandeau.Bandeau;

public class EffetRotation extends Effet{

    public EffetRotation(){
        super();
    }
    
    public void appliquer(Bandeau bandeau) {

        for (double i = 0; i <= 2.1; i=i+0.1){
            bandeau.setRotation(Math.PI * i);
            bandeau.sleep(50);
        }
        
    }
    
    
}
