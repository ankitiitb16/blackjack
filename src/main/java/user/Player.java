package user;

import model.Card;
import model.Hand;

public abstract class Player {
    private String id;
    private String password;
    private double balance;
    private AccountStatus accountStatus;
    private Person person;
    private Hand hand;

    public void addHand(Card card1, Card card2){
        this.hand = new Hand(card1, card2);
    }

    public void removeHand(Hand hand){
        if(this.hand == hand){
            this.hand = null;
        }
    }

    public void addCardToHand(Card card){
        hand.addCard(card);
    }

    public boolean resetPassword(){
        return true;
    }
}
