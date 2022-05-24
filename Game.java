


package blackjack;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author J stock
 */
public class Game {
    Player players[]=new Player[4];
    Card cards[]=new Card[52];
    static int highscr=0;

   public  void create_deck()
    {
    for(int i=0;i<52;i++)
    {
        cards[i]=new Card();
    if (i<13)
    {
        cards[i].setSuit(0);
        cards[i].setRank(i);
        if(i>9){cards[i].setValue(10);}
        else {cards[i].setValue(i+1);}
    }
    else if(i>=13&&i<26)
    {
     cards[i].setSuit(1);
        cards[i].setRank(i-13);
        if(i>22){cards[i].setValue(10);}
        else {cards[i].setValue(i-12);}
    }
    else if(i>=26&&i<39)
    {
        cards[i].setSuit(2);
        cards[i].setRank(i-26);
        if(i>35){cards[i].setValue(10);}
        else {cards[i].setValue(i-25);}
    }
    else
    {
     cards[i].setSuit(3);
        cards[i].setRank(i-39);
        if(i>48){cards[i].setValue(10);}
        else {cards[i].setValue(i-38);}
    }
    }
}
public Card choose_card()
{
Random number =new Random();
boolean x=true;
int y=0;
while(x){
int number_choosed=number.nextInt(52);
if (cards[number_choosed]==null){continue;}
y=number_choosed;
x=false;
}
Card cc=new Card(cards[y]);
cards[y]=null;

return cc;
}
  public void playerInf()
  { Scanner input=new Scanner(System.in);
  
   players[0]=new Player();
      System.out.println("Enter the name of first player");
      String s=input.next();
      players[0].setName(s);
      
      for(int i=0;i<2;i++)
      { players[0].c[i]=choose_card();
      players[0].setScore(players[0].c[i].getValue()+players[0].getScore());
      } 
      
      
      //////////////////
         players[1]=new Player();

       System.out.println("Enter the name of seconde player");
      String ss=input.next();
      players[1].setName(ss);
      for(int i=0;i<2;i++)
      { players[1].c[i]=choose_card();
            players[1].setScore(players[1].c[i].getValue()+players[1].getScore());

      }
  ////////////////////////////////////////////////////////
     players[2]=new Player();

  System.out.println("Enter the name of third player");
      String sss=input.next();
      players[2].setName(sss);
      for(int i=0;i<2;i++)
      { players[2].c[i]=choose_card();
            players[2].setScore(players[2].c[i].getValue()+players[2].getScore());

      }
     
      //////////////////////////////////////////////
         players[3]=new Player();

    System.out.println("Enter the name of fourth player");
      String ssss=input.next();
      players[3].setName(ssss);
      for(int i=0;i<2;i++)
      { players[3].c[i]=choose_card();
            players[3].setScore(players[3].c[i].getValue()+players[3].getScore());

      }
      
  }
    
  public void upate_max()
  { 
      for(int i=0;i<3;i++)
      { 
          if(players[i].getScore()<21)
          {
              if(players[i].getScore()>Game.highscr) {
                  Game.highscr=players[i].getScore();
              }
          }
        
  }
  } 
    public void upate_max2()
  { 
      for(int i=0;i<4;i++)
      { 
          if (players[i].getScore()<=21){
              if(players[i].getScore()>Game.highscr) {
                  Game.highscr=players[i].getScore();
              }
      }
        
  }
  }
}
///if(players[i].getScore()<=21&&players[i].getScore()>Game.highscr){Game.highscr=players[i].getScore();}///