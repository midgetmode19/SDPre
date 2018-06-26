import java.util.Scanner;
//Exercise30
public class RunningTotal {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int current, total = 0;

    System.out.println("\nType in a bunch of values and I'll add them up.");
    System.out.println("I'll stop when you type a 0.");

    /*while (current !=0) {
      System.out.println("Value: ");
      current = keyboard.nextInt();
      total += current;
      System.out.println("The total so far is " + total);
    }*/
    //This code compiled and worked perfectly, despite the instructions
    //saying that it wouldn't?
    do {
      System.out.println("Value: ");
      current = keyboard.nextInt();
      total += current;

      if (current != 0)
      System.out.println("The total so far is " + total);
    } while (current !=0);

    System.out.println("The final total is: " + total);
  }
}
