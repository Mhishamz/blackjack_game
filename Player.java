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
public class Player {
    private String name;
    private int score=0;
    Card c[]=new Card[11];
    private boolean bj=false;
    private boolean al=false;

    public Player() {
    }

    

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

   

    public boolean isBj() {
        return bj;
    }

    public boolean isAl() {
        return al;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setBj(boolean bj) {
        this.bj = bj;
    }

    public void setAl(boolean al) {
        this.al = al;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
