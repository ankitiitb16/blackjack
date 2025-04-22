package model;

import lombok.Data;

@Data
public class Card {
    Suit suit;
    int faceValue;

    public Card(Suit suit, int faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }
}
