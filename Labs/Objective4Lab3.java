import java.util.Scanner;
import static java.lang.System.out;

public class Objective4Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userNum;

    out.println("\nPlease a number:");
    userNum = scanner.nextInt();

    if (userNum > 0){
      out.println("" + userNum + " is greater than 0.");
    }
    else if (userNum < 0) {
      out.println("" + userNum + " is less than 0.");
    }
    else if (userNum == 0){
      out.println("The number you picked is equal to 0!");
    }
    /*else {
      out.println("Please enter a valid number.");
    }*/
    //I am uncertain at this time of how to print out an error if an
    //invalid input is entered, rather than crashing the program
    scanner.close();
  }
}
