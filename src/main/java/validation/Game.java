package validation;


public interface Game {



    public default void gameOver() {

    }

    public default void gameStart() {

    }

    public default void gameFinish() {
    }

    public default Integer userAnswer() {
        return null;
    }

}
