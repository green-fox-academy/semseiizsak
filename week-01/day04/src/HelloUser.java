import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        System.out.println("What is your name kind sir?");
        String userInput1 = scanner.nextLine();
        System.out.println("Thank you, welcome here: " + userInput1);
    }

}
