public class changeElementHELP {
    // - Create an array variable named `numbers`
    //   with the following content: `[1, 2, 3, 8, 5, 6]`
    // - Change the 8 to 4
    // - Print the fourth element
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 8, 5, 6};
        numbers[3] = 4;

        for (int number : numbers) {

            System.out.println("This is the fourth element; " + number);
        }
    }
}



















