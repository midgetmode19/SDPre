import java.util.Scanner;
//Exercise 28
public class SafeSquareRoot {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    String readyCheck;

    System.out.println("\nAre you ready to do some square roots? Yes or no?");
    readyCheck = keyboard.next();

    if (readyCheck.compareToIgnoreCase("no") == 0) {
      System.out.println("Okay, come back when you are ready!");
    }
    if (! readyCheck.equalsIgnoreCase("yes") || ! readyCheck.equalsIgnoreCase("no")) {
      System.out.println("That wasn't a yes or no...");
      System.out.println("Are you ready to do some square roots? Yes or no?");
      readyCheck = keyboard.next();
      while (readyCheck.compareToIgnoreCase("yes") == 0) {

        System.out.println("Give me a number and I'll find it's square root.");
        System.out.println("(No negatives, please. I don't like imaginary numbers.)");
        x = keyboard.nextDouble();

        while (x < 0) {
          System.out.println("I can't deal with imaginary numbers.");
          System.out.println(("Give me a new number:"));
          x = keyboard.nextDouble();
        }
        y = Math.sqrt(x);

        System.out.println("The square root of "+x+" is "+y+".");
        break;
      }
    }
  }
}
