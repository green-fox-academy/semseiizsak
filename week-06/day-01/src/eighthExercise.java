import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class eighthExercise {
    public static void main(String[] args) {
        char c= 'M' + 'B' + 'l' + 'k' + 'M' + 'A' + 'A' + 'B';
        List<Character> characters = new ArrayList<>();
        characters.add(c);

        charToString(characters);
    }

    public static String charToString(List<Character> characters){
        String concatString = characters.stream().toString();
        System.out.println(concatString);
        return concatString;
    }
}
