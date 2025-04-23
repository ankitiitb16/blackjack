package user;

import model.Hand;

public abstract class Player {
    private String id;
    private String password;
    private double balance;
    private AccountStatus accountStatus;
    private Person person;
    private Hand hand;

    public void addHand(Hand hand){
        this.hand = hand;
    }

    public void removeHand(Hand hand){
        if(this.hand == hand){
            this.hand = null;
        }
    }

}
