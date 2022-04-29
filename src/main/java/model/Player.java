package model;

public class Player  {
    private String name;
    private Double points;

    private Integer answer;

    public Player(){

    }
    public Player(String name,Double points, Integer answer){
        this.name = name;
        this.points = points;
        this.answer = answer;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPoints() {
        return points;
    }

    public void setPoints(Double points) {
        this.points = points;
    }



    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }
}
