import java.util.Scanner;

public class ShallowGrandmother{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    int age;
    double income, cute;
    boolean allowed;

    System.out.println("\nEnter your age:");
    age = keyboard.nextInt();

    System.out.println("Enter your yearly income:");
    income = keyboard.nextDouble();

    System.out.println("How cute are you, on a scale from 0.0 to 10.0?");
    cute = keyboard.nextDouble();

    allowed = (age > 25 && age < 40 && (income > 50000 || cute >= 8.5));

    System.out.println("Allowed to date my grandchild? " + allowed + "\n");

    //Study drill
    boolean allowed2;
    int happyMeter;

    System.out.println("How happy do you make them?");
    happyMeter = keyboard.nextInt();

    allowed2 = (happyMeter >= 7);
    System.out.println("Allowed to date my grandchild? " + allowed2);
  }
}
