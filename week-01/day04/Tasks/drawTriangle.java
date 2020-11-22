import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

// Write a program that reads a number from the standard input,
// then draws a triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
public class drawTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter a number: ");
        int bum = scanner.nextInt();

        for (int i = 1; i < bum; i++) {
            for (int j = 1; j < bum; j++) {
                if (j<=i)
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
