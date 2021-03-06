import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.OptionalDouble;

public class fourthExercise {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        OptionalDouble average = numbers.stream().filter(x -> x%2 != 0).mapToDouble(x -> x).average();
        if(average.isPresent()){
            System.out.println(average.getAsDouble());
        } else{
            System.out.println("there is no number to get average from");
        }
    }
}
