import java.util.Scanner;

public class Objective7Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while(true) {
      printMenu();
      selection = scanner.nextInt();
      System.out.println();

      if (selection == 1) {
        sayHello();
      }
      else if (selection == 2) {
        favoriteFoods();
      }
      else if (selection != 3) {
        invalidInput();
      }
      else {
        exitFunction();
        break;
      }

    }

    scanner.close();

  }

  public static void printMenu() {
    System.out.println("\n___Menu___");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }

  public static void sayHello() {
    System.out.println("Hello World");
  }

  public static void favoriteFoods() {
    System.out.println("Apples, Bananas, and Coconuts");
  }

  public static void invalidInput() {
    System.err.println("Error, invalid selection");
  }

  public static void exitFunction() {
    System.out.println("Bye!");
    System.out.println();
  }

}
