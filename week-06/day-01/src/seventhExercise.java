import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class seventhExercise {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        wordStartWithDesiredCharacter(cities, "R");
    }

    public static List<String> wordStartWithDesiredCharacter(List<String> inputList, String startingCharacter){
        List<String> desiredString = inputList.stream().filter(p -> p.startsWith(startingCharacter)).collect(Collectors.toList());
        System.out.println(desiredString);
        return desiredString;
    }
}
