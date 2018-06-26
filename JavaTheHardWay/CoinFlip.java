import java.util.Scanner;
//Exercise 29
public class CoinFlip {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String coin, again;
    int streak = 0;
    boolean gotHeads;

    do {
      gotHeads = Math.random() < 0.5;

      if (gotHeads)
        coin = "Heads!";
      else
        coin = "Tails!";

      System.out.println("You flip a coin and it is... " + coin);
      /*All of the above statements had to be written without curly braces
      or else the program would fail to print out the correct streak*/
      if (gotHeads) {
        streak++;
        System.out.println("\tThat's " + streak + " in a row!");
        System.out.println("\tWould you like to flip again (y/n)?");
        again = keyboard.next();
      }
      else {
        System.out.println("\tYou lose everything!");
        System.out.println("\tOh noes... Should've quit while you were aHEAD lolol");
        //streak = 0; //This code causes the streak to always print as 0
        again = "n";
      }
    }
    while(again.equals("y"));
    System.out.println("Final score: " + streak);
  }
}
