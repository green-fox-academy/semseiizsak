// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

import java.util.Scanner;

public class countFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();

        if (secondNum < firstNum) {
            System.out.println("The second should be bigger!");

        } else if (firstNum < secondNum) {
            for (int i = firstNum; i < (secondNum + 1); i++) {
                System.out.println(i);
            }
        }


    }
}
