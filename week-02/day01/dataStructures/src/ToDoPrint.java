import java.util.ArrayList;

public class ToDoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        todoText = ("My todo:\n").concat(todoText);
        todoText = todoText.concat(" - Download games\n");
        todoText = todoText.concat("     - Diablo");

        // Add "My todo:" to the beginning of the todoText

        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        System.out.println(todoText);
    }
}
