package gameplay;

import model.Hand;

public class BlackJackGameView {
    public void playAction(String action, Hand hand){
        System.out.println("Player chose to "+ action);
        System.out.println("Current Hand Value "+ hand.getScores());
        System.out.println("Cards in Hand "+ hand.getCards());
    }
}
