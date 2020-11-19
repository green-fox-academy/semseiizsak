import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        System.out.println("Hey! Pls insert miles: ");
        double userInput2 = scanner.nextInt();
        double milesToKm = (userInput2 * 1.609344);
        System.out.println(userInput2 + " mile is " + milesToKm + " kilometer ");
    }
}