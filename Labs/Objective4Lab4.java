import java.util.Scanner;
import static java.lang.System.out;

public class Objective4Lab4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numInput;

    out.println("\nPlease enter a number:");
    numInput = input.nextInt();

    if(numInput%2 == 0) {
      out.println("The number you entered is even!");
    }
    else {
      out.println("The number you entered is odd!");
    }
    out.println();
  }
}
