package user;
import lombok.Data;
import model.Hand;

public class Dealer extends Player{
    Hand hand;
    public Dealer() {
        this.hand = new Hand();
    }

    private int getTotalScore(){
        return hand.getScores();
    }

    public Hand getHand() {
        return hand;
    }
}
