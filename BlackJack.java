/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import java.util.Scanner;
/**
 *
 * @author J stock
 */
public class BlackJack {

    /**
     * @param args the command line arguments
     */
   static Game blackj =new Game();
    
    public static void main(String[] args) {
    GUI gui=new GUI();
        
    blackj.create_deck();
    blackj.playerInf();
    gui.runGUI(blackj.cards, blackj.players[0].c, blackj.players[1].c, blackj.players[2].c,blackj.players[3].c);
   //////////////////////////
   int o=2;
   
   
   for(int i=0;i<3;i++)
   { 
   Card a=new Card();
   a=blackj.players[i].c[1];
    boolean h=choosing(i);
    
                System.out.println("that is player"+i);
    for(int j=0;j<11;j++)
    {
        if(blackj.players[i].c[j]==null){break;}
        System.out.print(blackj.players[i].c[j].getRank()+" ");
                System.out.print(blackj.players[i].c[j].getSuit()+" ");
        System.out.println(blackj.players[i].c[j].getValue());

    }
     System.out.println(blackj.players[i].getScore());
    for(int j=0;j<11;j++){if(blackj.players[i].c[j]==null){o=j-1;break;} }
    if(a!=blackj.players[i].c[o]){
    gui.updatePlayerHand(blackj.players[i].c[o], i);
    a=blackj.players[i].c[o];
    }
    while(h==false)
    {
    h=choosing(i);
             System.out.println("that is player"+i);
    for(int j=0;j<11;j++)
    {
        if(blackj.players[i].c[j]==null){break;}
        System.out.print(blackj.players[i].c[j].getRank()+" ");
                System.out.print(blackj.players[i].c[j].getSuit()+" ");
        System.out.println(blackj.players[i].c[j].getValue());

    }
     System.out.println(blackj.players[i].getScore());
      for(int j=0;j<11;j++){if(blackj.players[i].c[j]==null){o=j-1;break;} }
    if(a!=blackj.players[i].c[o]){
    gui.updatePlayerHand(blackj.players[i].c[o], i);
    a=blackj.players[i].c[o];}
   }
   } 
           blackj.upate_max();

  
    boolean l=dealer();
    Card a=new Card();
    a=blackj.players[3].c[1];
    for(int j=0;j<11;j++)
    {
        if(blackj.players[3].c[j]==null){break;}
        System.out.print(blackj.players[3].c[j].getRank()+" ");
                System.out.print(blackj.players[3].c[j].getSuit()+" ");
        System.out.println(blackj.players[3].c[j].getValue());

    }
     System.out.println(blackj.players[3].getScore());
           for(int j=0;j<11;j++){if(blackj.players[3].c[j]==null){o=j-1;break;} }
         if(a!=blackj.players[3].c[o])  {
   gui.updateDealerHand(blackj.players[3].c[o], blackj.cards);
         a=blackj.players[3].c[o];
         }
    while(l==false)
    {
        l=dealer(); 
         for(int j=0;j<11;j++)
    {
        if(blackj.players[3].c[j]==null){break;}
        System.out.print(blackj.players[3].c[j].getRank()+" ");
                System.out.print(blackj.players[3].c[j].getSuit()+" ");
        System.out.println(blackj.players[3].c[j].getValue());

    }
     System.out.println(blackj.players[3].getScore());
        for(int j=0;j<11;j++){if(blackj.players[3].c[j]==null){o=j-1;break;} }
         if(a!=blackj.players[3].c[o])  {
   gui.updateDealerHand(blackj.players[3].c[o], blackj.cards);
         a=blackj.players[3].c[o];}
    }
           blackj.upate_max2();

   int counterbj=0;
   int counterhs=0;
   for(int i=0;i<4;i++)
   {
       if(blackj.players[i].isBj())
       {
           counterbj++;
       }
       else if(blackj.players[i].getScore()==Game.highscr)
        {counterhs++;}
   }
   if(counterbj==1){
       for(int i=0;i<4;i++)
      {
       if(blackj.players[i].isBj())
       {
           System.out.println(blackj.players[i].getName()+" wins");}
       
       }
   }
   else if(counterbj>1||counterhs>1)  {System.out.println("PUSH");}
   else{
       for(int i=0;i<4;i++)
   {
       if(blackj.players[i].getScore()==Game.highscr)
       {System.out.println(blackj.players[i].getName()+" wins");}
   }
   }
    
    
    
    }
    public static boolean choosing(int i)
    { Scanner input =new Scanner(System.in);
    boolean v=false;
        System.out.println("hit enter(1)or stand enter(2)");
        int in=input.nextInt();
        if (in==1){
            for (int j=0;j<11;j++)
            {
                if(blackj.players[i].c[j]==null){
             blackj.players[i].c[j]=blackj.choose_card();
            blackj.players[i].setScore(blackj.players[i].c[j].getValue()+blackj.players[i].getScore());
             break;}
            }
        }
        if(blackj.players[i].getScore()==21) {blackj.players[i].setBj(true);v=true;}
        else if(blackj.players[i].getScore()>21){ blackj.players[i].setAl(true);v=true;}
        else if(in==2){v=true;}
        return v;
    }
    
    
    public static boolean dealer()
    {
        boolean g=false;
     if(blackj.players[3].getScore()<=Game.highscr)
     {
       for (int j=0;j<11;j++)
            {
                if(blackj.players[3].c[j]==null){
             blackj.players[3].c[j]=blackj.choose_card();
            blackj.players[3].setScore(blackj.players[3].c[j].getValue()+blackj.players[3].getScore());
             break;}
            }
     }
       if(blackj.players[3].getScore()==21) {blackj.players[3].setBj(true);g=true;}
        else if(blackj.players[3].getScore()>21){ blackj.players[3].setAl(true);g=true;}
     else if(blackj.players[3].getScore()>Game.highscr)
     {g=true;}
     return g;
    }
    
}
