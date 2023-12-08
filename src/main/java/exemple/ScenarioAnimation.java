package exemple;
import bandeau.Bandeau;
import java.util.ArrayList;



public class ScenarioAnimation {
    
    private ArrayList<Effet> list;

    public ScenarioAnimation(){
        this.list = new ArrayList<Effet>();
    }

    public void addEffect(Effet effet, int repetitions){
        for(int i=0; i<repetitions; i++){
            list.add(effet);
        }
    }

    public void appliquer(Bandeau monBandeau){
        for(Effet e : list){
            e.appliquer(monBandeau);
        }
    }
}
