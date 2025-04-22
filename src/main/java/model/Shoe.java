package model;

import java.util.Collections;
import java.util.List;

public class Shoe {
    List<Deck> decks;
    int numberOfDecks;

    public Shoe(List<Deck> decks, int numberOfDecks) {
        this.decks = decks;
        this.numberOfDecks = numberOfDecks;
        shuffle();
    }

    public void shuffle(){
        Collections.shuffle(decks);
    }

    public Card dealCard(){
        return decks.get(0).getCards().get(0);
    }
}
