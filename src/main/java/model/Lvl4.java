package model;

public class Lvl4 extends DadClass{
    Integer answerQ1=2;
    Integer answerQ2=3;
    Integer answerQ3=4;
    Integer answerQ4=1;
    Integer answerQ5=2;

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
        question1.add(0,"Which is one of the seven wonders of the ancient world?");
        question1.add(1,"1.  Eiffel tower");
        question1.add(2,"2.  Statue of Zeus");//CORRECT ANSWER
        question1.add(3,"3.  Liberty statue");
        question1.add(4,"4.  Easter island");
    }

    @Override
    public void makeQuestion2() {
        question2.add(0,"How many sides does a heptagon have?");
        question2.add(1,"1.  4");
        question2.add(2,"2.  6");
        question2.add(3,"3.  7");//CORRECT ANSWER
        question2.add(4,"4.  8");
    }

    @Override
    public void makeQuestion3() {
        question3.add(0,"Which animal causes the most deaths each year?");
        question3.add(1,"1.  Snake");
        question3.add(2,"2.  Spider");
        question3.add(3,"3.  Tiger");
        question3.add(4,"4.  Mosquito");//CORRECT ANSWER
    }

    @Override
    public void makeQuestion4() {
        question4.add(0,"What is the largest planet in the Solar System?");
        question4.add(1,"1.  Jupiter");//CORRECT ANSWER
        question4.add(2,"2.  Earth");
        question4.add(3,"3.  Saturn");
        question4.add(4,"4.  Neptune");
    }

    @Override
    public void makeQuestion5() {
        question5.add(0,"What is Saturn's largest moon?");
        question5.add(1,"1.  Hobbit");
        question5.add(2,"2.  Titan");//CORRECT ANSWER
        question5.add(3,"3.  Last moon");
        question5.add(4,"4.  First moon");
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
