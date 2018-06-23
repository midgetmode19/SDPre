public class CreatingVariables {
  public static void main(String[] args){
    int x, y, age;
    double seconds, e, checking;
    String firstName, lastName, title;

    //my new variables for the exercise, separate from the others for visibility.
    int z;
    double minutes;
    String city, state;


    x = 10;
    y = 400;
    age = 39;
    seconds = 4.71;
    e = 2.71828182845804523536;
    checking = 1.89;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";

    //my new values for my variables
    z = 5;
    minutes = 60;
    city = "Aurora";
    state = "Colorado";

    System.out.println( "The variable x contains " + x );
    System.out.println( "The value " + y + " is stored in the variable y." );
    System.out.println( "The experiment took " + seconds + " seconds." );
    System.out.println( "A favorite irrational # is Euler's number: " + e );
    System.out.println( "Hopefully you have more than $" + checking + "!" );
    System.out.println( "My name's " + title + " " + firstName + lastName );

    //my code to print out my variables
    System.out.println("The variable z was set to " + z);
    System.out.println("There are " + minutes + " minutes in an hour.");
    System.out.println("I live in " + city + ", " + state + ".");
  }
}
