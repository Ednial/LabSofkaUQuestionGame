package model;

public class Lvl2 extends DadClass{
    Integer answerQ1=4;
    Integer answerQ2=1;
    Integer answerQ3=1;
    Integer answerQ4=2;
    Integer answerQ5=4;

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
        question1.add(0,"Who is Ana Gabriel");
        question1.add(1,"1.  Writer");
        question1.add(2,"2.  Biker");
        question1.add(3,"3.  Chess player");
        question1.add(4,"4.  Singer");//CORRECT ANSWER
    }

    @Override
    public void makeQuestion2() {
        question2.add(0,"Which is the biggest animal?");
        question2.add(1,"1.  Blue whale");//CORRECT ANSWER
        question2.add(2,"2.  Leon");
        question2.add(3,"3.  Elephant");
        question2.add(4,"4.  Eagle");
    }

    @Override
    public void makeQuestion3() {
        question3.add(0,"Which is the smartest animal?");
        question3.add(1,"1.  Orangutan");//CORRECT ANSWER
        question3.add(2,"2.  Rat");
        question3.add(3,"3.  Crow");
        question3.add(4,"4.  Fox");
    }

    @Override
    public void makeQuestion4() {
        question4.add(0,"Where is the tallest build?");
        question4.add(1,"1.  Colombia");
        question4.add(2,"2.  Dubai");//CORRECT ANSWER
        question4.add(3,"3.  England");
        question4.add(4,"4.  USA");
    }

    @Override
    public void makeQuestion5() {
        question5.add(0,"Which planet is in third position of solar system? ");
        question5.add(1,"1.  Mercury");
        question5.add(2,"2.  Venus");
        question5.add(3,"3.  Mars");
        question5.add(4,"4.  Earth");//CORRECT ANSWER
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
