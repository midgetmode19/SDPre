import java.util.Scanner;

public class ComparingNumbers{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double first, second;

    System.out.println("Give me two numbers. First:");
    first = keyboard.nextDouble();
    System.out.println("Second:");
    second = keyboard.nextDouble();

    if (first < second)
      System.out.println(first + " is less than " + second);

    if (first <= second)
      System.out.println(first + " is less than or equal to " + second);

    if (first == second)
      System.out.println(first + " is equal to " + second);

    if (first >= second)
      System.out.println(first + " is greater than or equal to " + second);

    if (first > second)
      System.out.println(first + " is greater than " + second);

    if (first != second){
      System.out.println(first + " ist not equal to " + second);
      System.out.println("Hey.");//without the curly braces, this code will always run
      //with curly braces it only runs when first and second do not equal.
    }
  }
}
