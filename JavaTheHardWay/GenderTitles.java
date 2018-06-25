import static java.lang.System.*;
import java.util.Scanner;

public class GenderTitles {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    String title;

    out.println("First name:");
    String first = keyboard.next();
    out.println("Last name:");
    String last = keyboard.next();
    out.println("Gender (M/F):");
    String gender = keyboard.next();
    out.println("Age:");
    int age = keyboard.nextInt();

    if (age < 20) {
      title = first;
    }
    else {
      if(gender.equals("F")){
        out.println("Are you married, " + first + "? (Y/N):");
        String married = keyboard.next();
        if (married.equals("Y")){
          title = "Mrs.";
        }
        else {
          title = "Ms.";
        }
      }
      else {
        title = "Mr.";
      }
    }

    out.println("\n" + title + " " + last + "\n");
  }
}
