import java.util.Scanner;

public class Objective3Lab2 {
  public static void main(String[] args) {
    String name = "";
    Scanner input = new Scanner(System.in);

    System.out.println("\nWhat's your name?");
    name = input.next();
    System.out.println("Hello " + name + "!\n");

    input.close();
    /*This format does not pick up anything after a space
    if the user enters in their first and last names.*/
  }
}
