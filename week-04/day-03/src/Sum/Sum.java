package Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList());
        System.out.println(sum(list));
    }

    public static int sum(ArrayList<Integer> list) throws NullPointerException {
        int result = 0;
        for (Integer i : list) {
            result += i;
        }
        return result;

    }
}
