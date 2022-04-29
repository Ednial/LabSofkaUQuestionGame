package validation;
import controller.DataController;
import model.Player;


public class DataIn {
    boolean v;
    static DataController data = new DataController();
    static Player player = new Player();

    public boolean validationName(String name){
        v = true;
        player.setName(name);
        if(name.isEmpty()){
            System.err.println("Error, nickname not found.");
            v = false;
        }
        return v;
    }
    public boolean validationAnswer(Integer answer){
        player.setAnswer(answer);
        while (answer<0&&answer>5){
            System.err.println("Invalid typing.");
            v=false;
        }
        return v;
    }
    public boolean validationLvl(Integer lvl,double points){
        player.setPoints(points);
        while(lvl<0&&lvl>5){
            System.err.println("Unidentified level");
            v=false;
        }
        return v;
    }

    public Player makePlayer(){
        player.getName();
        player.getAnswer();
        player.getPoints();
        return player;
    }
}
