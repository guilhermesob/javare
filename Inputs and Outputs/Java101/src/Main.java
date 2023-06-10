import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newObj = new Scanner(System.in);

        // Take input from user
        System.out.println("Type your name, and your number");

        // String input
        String nameEntered = newObj.nextLine();

        // Numerical input from user
        int numEntered = newObj.nextInt();

        // Printing the result
        System.out.println("Your name is: " + nameEntered + " and your number is: " + numEntered);
    }
}
