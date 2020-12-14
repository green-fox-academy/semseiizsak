import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
// Create a function that takes 3 parameters: a path, a word and a number
// and is able to write into a file.

// The path parameter should be a string
// that describes the location of the file you wish to modify

    // The word parameter should also be a string that will be written to the file as individual lines
// The number parameter should describe how many lines the file should have.
// If the word is 'apple' and the number is 5, it should write 5 lines
// into the file and each line should read 'apple'
// The function should not raise any errors if it could not write the file.
    public static void main(String[] args) {
        writeToFile();
    }

    private static void writeToFile() {
        Scanner scanner = new Scanner(System.in);
        List<String> content = new ArrayList();
        try {
            System.out.println("Please write down your files name: ");
            String path = scanner.nextLine();
            System.out.println("Please write something... anyithing smh: ");
            String inWord = scanner.nextLine();
            System.out.println("OK, here comes the fun part!" +
                    "Just how many times do you want us to print it: ");
            int number = scanner.nextInt();

            path = path + ".txt";

            for (int i = 0; i < number + 1; i++) {
                Path filePath = Paths.get(path);
                Files.write(filePath, content);
                content.add(inWord);
            }
        } catch (Exception e) {
            System.out.println("Uh-oh, could not write the file!");
        }
    }
}