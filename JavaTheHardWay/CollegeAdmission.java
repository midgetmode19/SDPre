import static java.lang.System.*;
import java.util.Scanner;

public class CollegeAdmission{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int math;

    out.println("\nWelcome to the UT Austin College Admissions Interface!");
    out.println("Please enter your SAT math score (200-800):");
    math = keyboard.nextInt();

    out.println("Admittance status:");

    if (math >= 790){
      out.println("CERTAIN");
    }
    else if (math >= 710){
      out.println("SAFE");
    }
    else if (math >= 580){
      out.println("PROBABLE");
    }
    else if (math >= 500){
      out.println("UNCERTAIN");
    }
    else if (math >= 390){
      out.println("UNLIKELY");
    }
    else {//below 390
      out.println("DENIED");
    }
  }
}
