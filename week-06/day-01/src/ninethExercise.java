public class ninethExercise {

    public static int count(String string, char character) {
        Long counter = string.chars().filter(x -> x == character).count();
        System.out.println(counter.intValue());
        return counter.intValue();
    }


    public static void main(String[] args) {
        String string = "nhutrdcvubhjmnbugtrdfgubvghzttguhbvfutztrtzhb";
        char character = 'u';

        count(string, character);
    }
}
