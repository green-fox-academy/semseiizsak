import java.util.LinkedHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class frequencyOfCharacters {
    public static void main(String[] args) {
        String input = "aaaaaaaaasssdfffffffffffggggg";

        Stream.of(input.toLowerCase().split(""))
                .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .map(e -> e.getKey()+ ":" + e.getValue()+", ")
                .forEach(System.out::print);
    }
}
