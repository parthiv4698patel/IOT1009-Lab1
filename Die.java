// Parthiv Patel
// A00226243
// In this program, I will use three dice to make this dice game.

// import random
import java.util.Random;
//Die class
public class Die
{
      // Three variable
      private String name;
      private int side_number;
      private int Current_sideup;

      // Here I do not pass any argument so it is called 0 argument constructor
      public Die()
      {
          name = "d6";
          side_number = 6;
          roll();
      }


      // Here I pass one arguments so it is called 1 argument constructor
      public Die(int side_number)
      {
          this.side_number = side_number;
          name = "d" + side_number;
          roll();
      }

      // Here I pass two arguments so it is called 2 argument constructor
      public Die(int side_number, int Current_sideup)
      {
          this.side_number = side_number;
          name = "d" + side_number;
          this.Current_sideup = Current_sideup;
      }

      // Rolling method will roll the dice and generate the random value from the dice
      public void roll()
      {
          Current_sideup = (int)((Math.random() * side_number) + 1);
      }

      // here I will return name of dice using getname method
      public String getname()
      {
          return name;
      }

      // here I will return number of side for dice using getsidenumber method
      public int getsidenumber()
      {
          return side_number;
      }

      // here I will up the current side of dice using getcurrentsideup method
      public int getcurrentsideup()
      {
          return Current_sideup;
      }

      // here I set the side of dice
      public void setsidenumber(int side_number)
      {
          this.side_number = side_number;
          name = "d6";
      }

      // here I set current side of dice
      public void setcurrentsideup(int Current_sideup)
      {
         this.Current_sideup = Current_sideup;
      }

}
