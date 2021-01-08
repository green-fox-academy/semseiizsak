import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class thirdExercise {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);

        List<Integer> squaredNumbers = numbers.stream().map( x -> x * x).collect(Collectors.toList());



    }
}
