//Exercise 33
public class ThereAndBackAgain {
  public static void main(String[] args) {
    System.out.println("Here.");
    erebor();//compile error without parentheses
    System.out.println("Back first time.");
    erebor(); //when removed, program doesn't print "there" a second time.
    System.out.println("Back second time.");
  }

  public static void erebor() {
    System.out.println("There.");
  }
}
