import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.
        Scanner scanner = new Scanner(System.in);
        int oddOrEven = scanner.nextInt();
        int a = oddOrEven;

        if (oddOrEven % 2 == 0) {
            System.out.println("Yaaay! The value of the \"a\" variable is Even!"); // This block will NOT run
        } else {
            System.out.println("Yaaay! The value of the \"a\" variable is Odd"); // This block will run
        }

    }
}
