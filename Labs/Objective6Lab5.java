import java.util.Scanner;
import static java.lang.System.*;

public class Objective6Lab5 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int selection;


    while (true) {
      out.println("Please select an option from the menu:");
      out.println();
      out.println("___Menu___");
      out.println("1: Say Hello");
      out.println("2: List my favorite foods");
      out.println("3: Exit");
      out.println();

      selection = scanner.nextInt();
      out.println();

      if (selection == 1) {
        out.println("Hello world");
      }

      else if (selection == 2) {
        out.println("Apples, Bananas, and Coconuts");
      }
      else if (selection == 3) {
        out.println("Bye!");
        out.println();
        break;
      }
      else {
        out.println(selection + " is not a valid selection.");
        out.println("Please select an option from the menu:");
        out.println();
      }
      out.println();
    }
  }
}
