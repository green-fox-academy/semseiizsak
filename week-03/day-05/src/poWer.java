public class poWer {
    // Given base and n that are both 1 or more
    // compute recursively (no loops)
    // the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

    private static int powerN(int base, int n) {
            //return (n - 1);
            if (1 < base) {
                n--;
                return base * powerN(base, n);
            }
            return n;
        }


    public static void main(String[] args) {
        System.out.println(powerN(3,2));
    }
}
