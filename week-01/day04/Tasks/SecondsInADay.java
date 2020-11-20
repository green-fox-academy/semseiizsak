public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        currentHours = (currentHours * 60) * 60;
        currentMinutes = currentMinutes * 60;

        int secondsInDay = (24 * 60) * 60;
        int fullCurrentSeconds = currentHours + currentMinutes + currentSeconds;

        System.out.println(secondsInDay - fullCurrentSeconds);
    }
}
