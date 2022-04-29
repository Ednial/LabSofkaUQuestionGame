package model;

public class Lvl5 extends DadClass{
    Integer answerQ1=2;
    Integer answerQ2=2;
    Integer answerQ3=4;
    Integer answerQ4=4;
    Integer answerQ5=1;

    public Integer getAnswerQ1() {
        return answerQ1;
    }

    public Integer getAnswerQ2() {
        return answerQ2;
    }

    public Integer getAnswerQ3() {
        return answerQ3;
    }

    public Integer getAnswerQ4() {
        return answerQ4;
    }

    public Integer getAnswerQ5() {
        return answerQ5;
    }

    @Override
    public void makeQuestion1() {
        question1.add(0,"How many musical notes are there?");
        question1.add(1,"1.  4");
        question1.add(2,"2.  12");//CORRECT ANSWER
        question1.add(3,"3.  9");
        question1.add(4,"4.  15");
    }

    @Override
    public void makeQuestion2() {
        question2.add(0,"Where were the first atomic bombs dropped?");
        question2.add(1,"1.  South korea");
        question2.add(2,"2.  Japan");//CORRECT ANSWER
        question2.add(3,"3.  Germany");
        question2.add(4,"4.  Taiwan");
    }

    @Override
    public void makeQuestion3() {
        question3.add(0,"Which is the fastest animal?");
        question3.add(1,"1.  Rabbit");
        question3.add(2,"2.  Turtle");
        question3.add(3,"3.  Leopard");
        question3.add(4,"4.  Falcon");//CORRECT ANSWER
    }

    @Override
    public void makeQuestion4() {
        question4.add(0,"What is the best-selling video game console in history?");
        question4.add(1,"1.  Wii U");
        question4.add(2,"2.  Xbox 360");
        question4.add(3,"3.  Playstation 4");
        question4.add(4,"4.  Playstation 2");//CORRECT ANSWER
    }

    @Override
    public void makeQuestion5() {
        question5.add(0,"Which former South African president was imprisoned for 27 years?");
        question5.add(1,"1.  Nelson Mandela");//CORRECT ANSWER
        question5.add(2,"2.  Buddha");
        question5.add(3,"3.  Jesus");
        question5.add(4,"4.  Obama");
    }
    @Override
    public void showQ1() {
        for (int i=0; i<5;i++){
            System.out.println(question1.get(i));
        }
    }
    @Override
    public void showQ2() {
        for (int i=0; i<5;i++){
            System.out.println(question2.get(i));
        }
    }
    @Override
    public void showQ3() {
        for (int i=0; i<5;i++){
            System.out.println(question3.get(i));
        }
    }
    @Override
    public void showQ4() {
        for (int i=0; i<5;i++){
            System.out.println(question4.get(i));
        }
    }
    @Override
    public void showQ5() {
        for (int i=0; i<5;i++){
            System.out.println(question5.get(i));
        }
    }
    @Override
    public void randomQuestion(Integer x) {
        switch (x){
            case 0:
                makeQuestion1();
                showQ1();
                break;
            case 1:
                makeQuestion2();
                showQ2();
                break;
            case 2:
                makeQuestion3();
                showQ3();
                break;
            case 3:
                makeQuestion4();
                showQ4();
                break;
            case 4:
                makeQuestion5();
                showQ5();
                break;
        }
    }
}
