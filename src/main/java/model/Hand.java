package model;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public Hand(Card card1, Card card2) {
        cards = new ArrayList<>();
        cards.add(card1);
        cards.add(card2);
    }

    public int getScores(){
        int total = 0;
        int aceCount = 0;
        for (Card card: cards){
            total += card.getFaceValue();
            if(card.getFaceValue()==11){
                aceCount++;
            }
        }
        while(total > 21 && aceCount > 0){
            total -=10;
            aceCount--;
        }
        return total;
    }

    public void addCard (Card card){
        cards.add(card);
    }

    public List<Card> getCards() {
        return cards;
    }
}
