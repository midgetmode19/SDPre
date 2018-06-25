import java.util.Scanner;
//Exercise 27
public class KeepGuessing {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int secret, guess;

    secret = 1 + (int)(Math.random()*10);

    System.out.println("\nI have chosen a number between 1 and 10.");
    System.out.println("Try to guess it!");
    guess = keyboard.nextInt();

    while (secret != guess && guess != 0) {
      System.out.println("That is incorrect. Guess again, or enter 0 to quit.");
      guess = keyboard.nextInt();
    }
    if (guess == secret){
      System.out.println("That's right! You're such a good guesser. The best!\n");
    }
    if (guess == 0){
      System.out.println("Aww okay. Bye!\n");
    }
  }
}
