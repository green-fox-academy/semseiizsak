import org.w3c.dom.ls.LSOutput;

public class recursiveSumDigit {

    private static int sumDigit(int n) {
        if (0 < n) {
            return (n % 10) + sumDigit(n / 10);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(sumDigit(20355));
    }
}


