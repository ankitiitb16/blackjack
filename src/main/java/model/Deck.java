package model;

import java.util.List;

public class Deck {
    List<Card> cards;

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    public List<Card> getCards() {
        return cards;
    }
}
