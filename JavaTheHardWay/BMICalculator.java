import java.util.Scanner;

public class BMICalculator{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double inches, feet, lbs, inchestotal, bmi;

    System.out.println("\nEnter your height (feet only): ");
    feet = keyboard.nextInt();
    System.out.println("Enter your height (inches): ");
    inches = keyboard.nextInt();

    System.out.print("Enter your weight in pounds: ");
    lbs = keyboard.nextInt();

    inchestotal = (feet*12)+inches;
    System.out.println("Your height in inches is "+inchestotal);
    bmi = lbs/(inchestotal*inchestotal)*703;

    System.out.println("Your BMI is "+bmi+".\n");
  }
}
