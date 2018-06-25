import java.util.Scanner;

public class EnterPIN { //Exercise 25
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String passWord;

    pin = 12345;

    System.out.println("\nWelcome to the bank of Java");
    System.out.println("Please enter your password:");
    passWord = keyboard.next();

    while (! passWord.equals("thebirdistheword")) {
      System.out.println("\nIncorrect password.");
      System.out.println("Please enter your password:");
      passWord = keyboard.next();
    }

    System.out.println("\nPlease enter your PIN:");
    entry = keyboard.nextInt();

    while (entry != pin) {
      System.out.println("\nIncorrect PIN. Try again.");
      System.out.println("Please enter your PIN:");
      entry = keyboard.nextInt();
    }

    System.out.println("\nPIN accepted. Your account balance is $425.17");
  }
}
