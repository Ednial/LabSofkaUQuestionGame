package controller;

import model.*;
import validation.DataIn;
import validation.Game;

public class DataController  implements Game {
    static Integer answer=0;
    static Integer x = randomNumber();
    static DataIn dataIn = new DataIn();
    Lvl1 lvl1 = new Lvl1();
    Lvl2 lvl2 = new Lvl2();
    Lvl3 lvl3 =  new Lvl3();
    Lvl4 lvl4 = new Lvl4();
    Lvl5 lvl5 =  new Lvl5();

    public Integer getX(){
        return x;
    }
    public static Integer randomNumber() {
        Integer x = (int)(Math.random()*4);
        return x;
    }


    public void getQuestionsAndAnswers(Integer level) {
        switch (level){
            case 1:
                x=randomNumber();
                lvl1.randomQuestion(x);
                break;
            case 2:
                x=randomNumber();
                lvl2.randomQuestion(x);
                break;
            case 3:
                x=randomNumber();
                lvl3.randomQuestion(x);
                break;
            case 4:
                x=randomNumber();
                lvl4.randomQuestion(x);
                break;
            case 5:
                x=randomNumber();
                lvl5.randomQuestion(x);
                break;
            default:
                System.err.println("Error");
                break;
        }
    }
    public boolean correctAnswerLvl1(Integer Uanswer, Integer x) {
        x=getX();
        if (x==0&&Uanswer==lvl1.getAnswerQ1()){
            System.out.println("Great! Lets continue...\n");
            return true;
        }
        if (x==1&&Uanswer==lvl1.getAnswerQ2()){
            System.out.println("Great! Lets continue...\n");
            return true;
        }
        if (x==2&&Uanswer==lvl1.getAnswerQ3()){
            System.out.println("Great! Lets continue...\n");
            return true;
        }
        if (x==3&&Uanswer==lvl1.getAnswerQ4()){
            System.out.println("Great! Lets continue...\n");
            return true;
        }
        if (x==4&&Uanswer==lvl1.getAnswerQ5()){
            System.out.println("Great! Lets continue...\n");
            return true;
        }
        gameOver();
        return false;
    }
    public boolean correctAnswerLvl2(Integer Uanswer,Integer x) {
        x=getX();
        if (x==0&&Uanswer==lvl2.getAnswerQ1()){
            System.out.println("Great! Lets continue...\n");
            return true;
        }
        if (x==1&&Uanswer==lvl2.getAnswerQ2()){
            System.out.println("Great! Lets continue...\n");
            return true;
        }
        if (x==2&&Uanswer==lvl2.getAnswerQ3()){
            System.out.println("Great! Lets continue...\n");
            return true;
        }
        if (x==3&&Uanswer==lvl2.getAnswerQ4()){
            System.out.println("Great! Lets continue...\n");
            return true;
        }
        if (x==4&&Uanswer==lvl2.getAnswerQ5()){
            System.out.println("Great! Lets continue...\n");
            return true;
        }
        gameOver();
        return false;
    }
    public boolean correctAnswerLvl3(Integer Uanswer,Integer x) {
        x=getX();
        if (x==0&&Uanswer==lvl3.getAnswerQ1()){
            System.out.println("Great! Lets continue...\n");
            return true;
        }
        if (x==1&&Uanswer==lvl3.getAnswerQ2()){
            System.out.println("Great! Lets continue...\n");
            return true;
        }
        if (x==2&&Uanswer==lvl3.getAnswerQ3()){
            System.out.println("Great! Lets continue...\n");
            return true;
        }
        if (x==3&&Uanswer==lvl3.getAnswerQ4()){
            System.out.println("Great! Lets continue...\n");
            return true;
        }
        if (x==4&&Uanswer==lvl3.getAnswerQ5()){
            System.out.println("Great! Lets continue...\n");
            return true;
        }
        gameOver();
        return false;
    }
    public boolean correctAnswerLvl4(Integer Uanswer,Integer x) {
        x=getX();
        if (x==0&&Uanswer==lvl4.getAnswerQ1()){
            System.out.println("Great! Lets continue...\n");
            return true;
        }
        if (x==1&&Uanswer==lvl4.getAnswerQ2()){
            System.out.println("Great! Lets continue...\n");
            return true;
        }
        if (x==2&&Uanswer==lvl4.getAnswerQ3()){
            System.out.println("Great! Lets continue...\n");
            return true;
        }
        if (x==3&&Uanswer==lvl4.getAnswerQ4()){
            System.out.println("Great! Lets continue...\n");
            return true;
        }
        if (x==4&&Uanswer==lvl4.getAnswerQ5()){
            System.out.println("Great! Lets continue...\n");
            return true;
        }
        gameOver();
        return false;
    }
    public boolean correctAnswerLvl5(Integer Uanswer,Integer x) {
        x=getX();
        if (x==0&&Uanswer==lvl5.getAnswerQ1()){
            System.out.println("Great! Lets continue...\n");
            return true;
        }
        if (x==1&&Uanswer==lvl5.getAnswerQ2()){
            System.out.println("Great! Lets continue...\n");
            return true;
        }
        if (x==2&&Uanswer==lvl5.getAnswerQ3()){
            System.out.println("Great! Lets continue...\n");
            return true;
        }
        if (x==3&&Uanswer==lvl5.getAnswerQ4()){
            System.out.println("Great! Lets continue...\n");
            return true;
        }
        if (x==4&&Uanswer==lvl5.getAnswerQ5()){
            System.out.println("Great! Lets continue...\n");
            return true;
        }
        gameOver();
        return false;
    }

    public Integer levelUp1(Integer lvl, Integer Uanswer, double points){
        dataIn.validationLvl(lvl,points);
        do{
            if(correctAnswerLvl1(Uanswer, getX())&&lvl==1){
                lvl++;
                return lvl;
            }
        }while (lvl==1);
        return lvl;
    }
    public Integer levelUp2(Integer lvl, Integer Uanswer, double points){
        dataIn.validationLvl(lvl,points);
        do{
            if(correctAnswerLvl2(Uanswer, getX())&&lvl==2){
                lvl++;
                return lvl;
            }
        }while (lvl==2);
        return lvl;
    }
    public Integer levelUp3(Integer lvl, Integer Uanswer, double points){
        dataIn.validationLvl(lvl,points);
        do{
            if(correctAnswerLvl3(Uanswer, getX())&&lvl==3){
                lvl++;
                return lvl;
            }
        }while (lvl==3);
        return lvl;
    }
    public Integer levelUp4(Integer lvl, Integer Uanswer, double points){
        dataIn.validationLvl(lvl,points);
        do{
            if(correctAnswerLvl4(Uanswer, getX())&&lvl==4){
                lvl++;
                return lvl;
            }
        }while (lvl==4);
        return lvl;
    }
    public Integer levelUp5(Integer lvl, Integer Uanswer, double points){
        dataIn.validationLvl(lvl,points);
        do{
            if(correctAnswerLvl5(Uanswer, getX())&&lvl==5){
                lvl++;
                return lvl;
            }
        }while (lvl==5);
        return lvl;
    }
    @Override
    public void gameOver() {
        System.out.println("Too bad :C\n Try again...");
        System.exit(0);
    }
}
