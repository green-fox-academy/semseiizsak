public class sumElements {
    // - Create an array variable named `numbers`
    //   with the following content: `[54, 23, 66, 12]`
    // - Print the sum of the second and the third element
    public static void main(String[] args) {
        int[] numbers = {54, 23, 66, 12};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i == 1 || i == 2) {
                sum += numbers[i];
            }
        }
        System.out.println("This is the sum of my sum of the 2nd and 3rd number: " + sum);
    }
}