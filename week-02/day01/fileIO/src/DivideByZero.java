import java.util.Scanner;

public class DivideByZero {
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0
    public static void main(String[] args) {
        dividesWithTen();
    }

    private static void dividesWithTen() {
        System.out.println("Please insert a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        try {
            int finalNumber = (10 / number);
            System.out.println("Your number divided by ten is : " + finalNumber);

        } catch (ArithmeticException e) {
            System.out.println("Can't divide!");
        }

    }


}
