package model;

public class Lvl3 extends DadClass{
    Integer answerQ1=3;
    Integer answerQ2=1;
    Integer answerQ3=3;
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
        question1.add(0,"Which is the one with the país most inhabitants in the world?");
        question1.add(1,"1.  India");
        question1.add(2,"2.  USA");
        question1.add(3,"3.  China");//Correct answer
        question1.add(4,"4.  Japan");
    }

    @Override
    public void makeQuestion2() {
        question2.add(0,"Where is Transylvania?");
        question2.add(1,"1.  Romania");//Correct Answer
        question2.add(2,"2.  Ukraine");
        question2.add(3,"3.  Russia");
        question2.add(4,"4.  Germany");
    }

    @Override
    public void makeQuestion3() {
        question3.add(0,"What is the country with the fewest inhabitants in the world?");
        question3.add(1,"1.  Peru");
        question3.add(2,"2.  Andorra");
        question3.add(3,"3.  Vatican city");//Correct answer
        question3.add(4,"4.  Brazil");
    }

    @Override
    public void makeQuestion4() {
        question4.add(0,"What day is the national holiday of the United States?");
        question4.add(1,"1.  May 1st");
        question4.add(2,"2.  July 4th");//Correct answer
        question4.add(3,"3.  October 31st");
        question4.add(4,"4.  December 25th");
    }

    @Override
    public void makeQuestion5() {
        question5.add(0,"When did Freddie Mercury die?");
        question5.add(1,"1.  2002");
        question5.add(2,"2.  1998");
        question5.add(3,"3.  1991");//Correct answer
        question5.add(4,"4.  2000");
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
