package model;

import java.util.ArrayList;

public  abstract class DadClass {
    ArrayList question1 = new ArrayList();
    ArrayList question2 = new ArrayList();
    ArrayList question3 = new ArrayList();
    ArrayList question4 = new ArrayList();
    ArrayList question5 = new ArrayList();
    public abstract void makeQuestion1();
    public abstract void makeQuestion2();
    public abstract void makeQuestion3();
    public abstract void makeQuestion4();
    public abstract void makeQuestion5();
    public abstract void showQ1();
    public abstract void showQ2();
    public abstract void showQ3();
    public abstract void showQ4();
    public abstract void showQ5();
    public abstract void randomQuestion(Integer x);


}
