package model;

public class Lvl1 extends DadClass{

    Integer answerQ1=3;
    Integer answerQ2=4;
    Integer answerQ3=1;
    Integer answerQ4=2;
    Integer answerQ5=3;

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
        question1.add(0,"How many is 2+2? ");
        question1.add(1,"1.  56");
        question1.add(2,"2.  22");
        question1.add(3,"3.  4");//Correct Answer
        question1.add(4,"4.  2");
    }

    @Override
    public void makeQuestion2() {
        question2.add(0,"Choose a trigonometry identity ");
        question2.add(1,"1.  (x)^(1/2)");
        question2.add(2,"2.  logX");
        question2.add(3,"3.  x^2");
        question2.add(4,"4.  cscX ");//Correct Answer
    }

    @Override
    public void makeQuestion3() {
        question3.add(0,"How long is the estimated life of cats?");
        question3.add(1,"1.  14 years");//Correct Answer
        question3.add(2,"2.  7 years");
        question3.add(3,"3.  5 years");
        question3.add(4,"4.  25 years");
    }

    @Override
    public void makeQuestion4() {
        question4.add(0,"What is the capital of France");
        question4.add(1,"1.  Bogota");
        question4.add(2,"2.  Paris");//Correct Answer
        question4.add(3,"3.  England");
        question4.add(4,"4.  Asia");
    }

    @Override
    public void makeQuestion5() {
        question5.add(0,"Who is Gabriel G.M");
        question5.add(1,"1.  Runner");
        question5.add(2,"2.  Driver");
        question5.add(3,"3.  Writer");//Correct Answer
        question5.add(4,"4.  Cartoonist");
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
