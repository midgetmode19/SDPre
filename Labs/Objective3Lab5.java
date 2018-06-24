import java.util.Scanner;

public class Objective3Lab5{
  public static void main(String[] args){
    double num1;
    double num2;
    double total;
    Scanner input = new Scanner(System.in);

    System.out.println("\nPlease enter a number.");
    num1 = input.nextDouble();
    System.out.println("Please enter a second number and I will add it to the first.");
    num2 = input.nextDouble();
    total = num1 + num2;
    System.out.println("The sum of "+num1+" and "+num2+" is "+total+".\n");

    input.close();
  }
}
