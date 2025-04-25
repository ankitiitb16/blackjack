package user;

import model.Card;
import model.Hand;

public class BlackjackPlayer extends Player{
    private int bet;
    private int totalCash;

    public BlackjackPlayer() {
        super();
    }


    public void placeBet(int bet){
        this.bet = bet;
    }


}
