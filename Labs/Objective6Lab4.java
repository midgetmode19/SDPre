public class Objective6Lab4 {
  public static void main(String[] args) {
    int counter, countSum;
    counter = 1;
    countSum = 0;

    while (counter <= 20) {
      countSum = countSum + counter;
      counter++;
    }
    System.out.println("" + countSum);
  }
}
