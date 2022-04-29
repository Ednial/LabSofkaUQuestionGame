package view;


import model.Player;
import validation.DataIn;

public class ClassOutput {
    Player player = new Player();
    DataIn data = new DataIn();

    public void menu(String player){
        System.out.println("Welcome "+ player+"\n This game has 5 levels, each one with one question and four " +
                " possible answers.\n Choose the Correct answer for going on playing:\n");
    }
    public void showPlayer(){
        player=data.makePlayer();
        System.out.println("Name: "+player.getName()+"\n");
        System.out.println("Puntaje: "+player.getPoints()+"\n");
    }

}
