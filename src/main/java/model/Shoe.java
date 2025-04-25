package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Shoe {
    List<Deck> decks;
    int numberOfDecks;

    public Shoe(int numberOfDecks) {
        this.decks = new ArrayList<>();
        this.numberOfDecks = numberOfDecks;
        shuffle();
    }

    public void shuffle(){
        Collections.shuffle(decks);
    }

    public Card dealCard(){
        Random random = new Random(10);

        return new Card(Suit.CLUBS,random.nextInt(10));
//        return decks.get(0).getCards().get(0);
    }
}
