import java.io.Serializable;
import java.util.Random;

public class Player implements Serializable{
    private String number;
    private int score;
    
    public Player(int number){
        this.number = "Player_"+number;
        this.score = (new Random()).nextInt(11);
    }
    
    @Override
    public String toString(){
        return this.number+" score: "+score;
    }
}
