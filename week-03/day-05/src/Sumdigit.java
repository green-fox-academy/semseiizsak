public class Sumdigit {
    // Given a non-negative integer n, return the sum of it's digits recursively
    // (without loops).
    //
    // Hint
    //
    // Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
    //
    // Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).

    private static void sumDigit(int n) {
        if (0 < n) {
            if ( n < 1000 ){
                int firstDigit = ((n % 10) % 10) / 10;
                int secondDigit = (n % 10) / 10;
                int thirdDigit = n / 10;

                n = firstDigit + secondDigit + thirdDigit;
                System.out.println(firstDigit + "+" + secondDigit + "+" + thirdDigit + "=" + n);

            } else if ( n < 100 ){
                int firstDigit = (n % 10) / 10;
                int secondDigit = n / 10;

                n = firstDigit + secondDigit;

            } else if ( n < 10 ){
                int secondDigit = n / 10;


            }
        }
    }
}





