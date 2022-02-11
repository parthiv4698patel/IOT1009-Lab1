// here I will extend the Die class with DieGame
public class DieGame extends Die
{
  //main method
  public static void main(String[] args)
  {
     // here I make three Die object from the constructor
      Die d6 = new Die();
      Die d20 = new Die(20);
      Die d10 = new Die(10);

      // for output
      System.out.println("Creating a default d6...");
      System.out.println("Creating a d20...");
      System.out.println("Creating percentile die (a special d10)...");

      // T will reurn the d6 and their random side
      System.out.println("The Current side up for "+ d6.getname() + " is " + d6.getcurrentsideup());

      // T will reurn the d20 and their random side
      System.out.println("The Current side up for " + d20.getname()+ " is "+ d20.getcurrentsideup());

      // T will reurn the random side of d10 (percentile)
      System.out.println("The Current side up for percentile is " + d10.getcurrentsideup());

      System.out.println("\nTtesting the roll method\n");

      System.out.println("Rolling the d6...");
      // Here I will roll the d6
      d6.roll();
      System.out.println("The new value is " + d6.getcurrentsideup());

      // Here I will roll the d20
      System.out.println("Rolling the d20...");
      d20.roll();
      System.out.println("The current side up for d20 is " + d20.getcurrentsideup());

      // Here I will roll d10
      System.out.println("Rolling the percentile...");
      d10.roll();
      System.out.println("The new value is " + d10.getcurrentsideup());

      System.out.println("\nSetting the d20 to slow 20...");

      // Now I set the current side of d20
      d20.setcurrentsideup(20);
      System.out.println("the side up is now " + d20.getcurrentsideup() + ".Finally.");
  }
}
