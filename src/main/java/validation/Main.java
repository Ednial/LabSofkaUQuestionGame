package validation;
import dataBase.DataBaseLogic;
import model.Player;
import view.ClassOutput;
import controller.DataController;
import java.util.Scanner;

public class Main implements Game{
    static Scanner kb = new Scanner(System.in);
    static String name;
    static Integer answer;
    static Main game= new Main();
    static ClassOutput view = new ClassOutput();
    static DataIn validation = new DataIn();

    static DataController data = new DataController();
    static Integer lvl = 1;

    public static void main(String[] args) {
        game.gameStart();
    }


    @Override
    public void gameOver() {
        System.out.println("Too bad :C\n Try again...");
    }

    @Override
    public void gameStart() {
        System.out.println("Enter your nickname...");
        name=kb.nextLine();
        if (validation.validationName(name)){
            view.menu(name);
            gameFinish();
        }
    }


    @Override
    public Integer userAnswer() {
        answer = kb.nextInt();
        validation.validationAnswer(answer);
        return answer;
    }


    @Override
    public void gameFinish() {
        while (lvl<6){
            switch (lvl){
                case 1:
                    data.getQuestionsAndAnswers(lvl);
                    lvl = data.levelUp1(lvl, userAnswer(), 100);
                    break;
                case 2:
                    data.getQuestionsAndAnswers(lvl);
                    lvl = data.levelUp2(lvl, userAnswer(), 200);
                    break;
                case 3:
                    data.getQuestionsAndAnswers(lvl);
                    lvl = data.levelUp3(lvl, userAnswer(), 300);
                    break;
                case 4:
                    data.getQuestionsAndAnswers(lvl);
                    lvl = data.levelUp4(lvl, userAnswer(), 400);
                    break;
                case 5:
                    data.getQuestionsAndAnswers(lvl);
                    lvl = data.levelUp5(lvl, userAnswer(), 500);
                    System.out.println("¡CONGRATULATIONS!");
                    view.showPlayer();
                    DataBaseLogic conn5 =  new DataBaseLogic();
                    conn5.setConnectionToDB();
                    break;
            }
        }
    }


}
