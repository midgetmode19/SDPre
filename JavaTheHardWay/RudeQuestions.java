import java.util.Scanner;

public class RudeQuestions{
  public static void main(String[] args) {
    String name, city;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Hello, what is your name?");
    name = keyboard.next();

    System.out.println("Hi " + name + "! How old are you?");
    age = keyboard.nextInt();

    System.out.println("So you're " + age + ", eh? That's not very old.");
    System.out.println("How much do you weigh, " + name + "?");
    weight = keyboard.nextDouble();

    System.out.println(weight + "! Better keep that quiet!!");
    System.out.println("Finally, what's your income, " + name + "? ");
    income = keyboard.nextDouble();

    System.out.print("Hopefully that is " + income + " per hour");
    System.out.println(" and not per year!");
    System.out.print("Well, thanks for answering my rude questions, ");
    System.out.println(name + ".");

    System.out.println("Where do you live?");
    city = keyboard.next();
    System.out.println(city + " ?! That's so far away!");
    System.out.println();

    //program breaks when int value is put in place where double is expected.
    //I assume this is because doubles can hold decimal values and ints cannot.
    //Does not break when numeric values are put in when a string is expected.
    //I assume strings are able to hold both numeric and non-numeric values.
    //program also breaks when letters are entered where ints are expected.
    //I assume because ints are expected to be a numeric value, despite being able
    //to set letters as ints while writing the program.
  }
}
