public class numberAdder {
    // Write a recursive function that takes one parameter: n and
    // adds numbers from 1 to n.

    public static void main(String[] args) {
        numberAdder(75);
    }

    public static void numberAdder(int n) {
        if (n >= 1 ) {
            numberAdder(n - 1);
        }
        System.out.println("CUNT down: " + n);
    }
}
