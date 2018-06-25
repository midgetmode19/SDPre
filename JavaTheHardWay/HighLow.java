import java.util.Scanner;

public class HighLow {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int secret, guess;

    secret = 1 + (int)(100*Math.random());
    //System.out.println("\n" + secret);

    System.out.println("\nI'm thinking of a number between 1-100");
    System.out.println("Try to guess it!");
    guess = keyboard.nextInt();

    while (secret != guess) {
      if (guess < secret){
        System.out.println("Sorry, your guess is too low.");
      }
      if (guess > secret){
        System.out.println("Whoops, that guess is too high.");
      }
      System.out.println("Try again!\n");
      guess = keyboard.nextInt();
    }
    System.out.println("You guessed it! What are the odds?!");
  }
}
