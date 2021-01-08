import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class sixthExercise {

    /*public static String stringHasContent(String defaultValue){
        return Optional.ofNullable(System.getProperty("there is no string")).orElse(defaultValue);
    }*/

    public static void convertStringToCharList(String str) {
        List<Character> chars = str.chars().mapToObj(e -> (char) e).filter(Character::isUpperCase).collect(Collectors.toList());
        System.out.println(chars);
    }


    public static void main(String[] args) {
        String string = "jhgfbnuKtfcvUbnhfcbnKgfc njhgfvIcbnjuzgvbnjuhgv njhgv jhg";

        convertStringToCharList(string);
    }
}
