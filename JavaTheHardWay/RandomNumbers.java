public class RandomNumbers { //Exercise 24
  public static void main(String[] args) {
    int a, b, c, d;
    double r, rps;

    rps = Math.random();
    if (rps < 0.3333333) {
      System.out.println("Rock");
    }
    else if (rps < 0.6666667) {
      System.out.println("Paper");
    }
    else {
      System.out.println("Scissors");
    }

    //picks 4 random integers, each 1-10
    a = 1 + (int)(10*Math.random());
    b = 1 + (int)(10*Math.random());
    c = 1 + (int)(10*Math.random());
    d = 1 + (int)(10*Math.random());
    System.out.println("1-10:\t" + a + "\t" + b + "\t" + c + "\t" + d);

    //picks 4 random integers, each 1-6
    a = 1 + (int)(6*Math.random());
    b = 1 + (int)(6*Math.random());
    c = 1 + (int)(6*Math.random());
    d = 1 + (int)(6*Math.random());
    System.out.println("1-6:\t" + a + "\t" + b + "\t" + c + "\t" + d);

    //picks a single random integer, 1-100
    a = 1 + (int)(100*Math.random());
    System.out.println("1-100:\t" + a + "\t" + a + "\t" + a + "\t" + a);

    //picks 4 random integers, each 1-100
    a = 1 + (int)(100*Math.random());
    b = 1 + (int)(100*Math.random());
    c = 1 + (int)(100*Math.random());
    d = 1 + (int)(100*Math.random());
    System.out.println("1-100:\t" + a + "\t" + b + "\t" + c + "\t" + d);

    //picks 4 random integers, each 0-99
    a = 0 + (int)(100*Math.random());
    b = 0 + (int)(100*Math.random());
    c = (int)(100*Math.random());
    d = (int)(100*Math.random());
    System.out.println("0-99:\t" + a + "\t" + b + "\t" + c + "\t" + d);

    //picks 4 random integers, each 10-20
    a = 10 + (int)(11*Math.random());
    b = 10 + (int)(11*Math.random());
    c = 10 + (int)(11*Math.random());
    d = 10 + (int)(11*Math.random());
    System.out.println("10-20:\t" + a + "\t" + b + "\t" + c + "\t" + d);

    //displays 4 random doubles, each [0-1)
    System.out.println("0-1:\t" + Math.random() + "\t" + Math.random());
    System.out.println("0-1:\t" + Math.random() + "\t" + Math.random());

    r = 10*Math.random();
    System.out.println("0-9.99:\t" + r);
    System.out.println("0-9:\t" + (int)r);
    System.out.println("1-10:\t" + (1 + (int)r));

    //picks 3 random integers 0-3
    a = (int)(3*Math.random());
    b = (int)(3*Math.random());
    c = (int)(3*Math.random());
    System.out.println("0-3\t" + a + "\t" + b + "\t" + c);

    //picks 3 random integers 5-10
    a = 5 + (int)(6*Math.random());
    b = 5 + (int)(6*Math.random());
    c = 5 + (int)(6*Math.random());
    System.out.println("5-10\t" + a + "\t" + b + "\t" + c);
  }
}
