package gameplay;

import model.Card;
import model.Hand;
import model.Shoe;
import user.BlackjackPlayer;
import user.Dealer;
import user.Player;

public class BlackJackGame {
    private Player player;
    private Dealer dealer;
    private Shoe shoe;

    private final int MAX_NUM_OF_DECKS = 4;

    public BlackJackGame(BlackjackPlayer player, Dealer dealer) {
        this.player = player;
        this.dealer = dealer;
        this.shoe = new Shoe(MAX_NUM_OF_DECKS);
    }

    public void playAction(String action, Hand hand){
        if("hit".equalsIgnoreCase(action)){
            hit(hand);
        } else if ("Stand".equalsIgnoreCase(action)){
            stand();
        } else {
            System.out.println("Invalid action");
        }
    }

    public void hit(Hand hand){
        Card card = shoe.dealCard();
        hand.addCard(card);
        System.out.println("Card Dealt "+ card );
    }

    public void stand(){
        System.out.println("Player stands. Dealer's turn begins ...");
        while(dealer.getHand().getScores() < 17){
            Card card = shoe.dealCard();
            dealer.getHand().addCard(card);
            System.out.println("dealer draws "+ card);
        }
    }

    public void start(){
        player.getHand().addCard(shoe.dealCard());
        dealer.getHand().addCard(shoe.dealCard());
        player.getHand().addCard(shoe.dealCard());
        dealer.getHand().addCard(shoe.dealCard());
    }
}
