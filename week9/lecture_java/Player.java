package lecture9;

import java.io.Serializable;
import java.util.Random;

public class Player implements Serializable{
    private String name;
    private int score;

    public Player(int number) {
        this.name = String.format("Player_%02d", number);
        this.score = (new Random().nextInt(11));
    }

    @Override
    public String toString() {
        return String.format("%-8s score: %02d", name, score);
    }
}

