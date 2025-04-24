package user;

import model.Card;
import model.Hand;

public class BlackjackPlayer extends Player{
    private int bet;
    private int totalCash;

    public BlackjackPlayer(Card card1, Card card2) {
        Hand hand = new Hand(card1, card2);
    }

    public void placeBet(int bet){
        this.bet = bet;
    }


}
