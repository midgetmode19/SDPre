import java.util.Scanner;

public class Objective3Lab3 {
  public static void main(String[] args){

    int birthYear, age, currentYear;

    birthYear = 0;

    Scanner input = new Scanner(System.in);

    System.out.println("\nHow old are you?");
    age = input.nextInt();
    System.out.println("What is the current Year?");
    currentYear = input.nextInt();

    birthYear = currentYear - age;
    System.out.println("You were in the year " + birthYear + ".\n");

    input.close();

  }
}
