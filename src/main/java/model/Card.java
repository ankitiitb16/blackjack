package model;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class Card {
    Suit suit;
    int faceValue;

    public Card(Suit suit, int faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }

    @Override
    public String toString(){
        return suit.toString()+" of "+ faceValue;
    }
}
