/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author J stock
 */
public class Card {
    private int suit=0;
    private int rank=0;
    private int value=0;

    public Card() {
    }

    


    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public int getValue() {
        return value;
    }

  public Card(Card c)
  { 
    suit=c.suit;
    rank=c.rank;
    value=c.value;
}

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
