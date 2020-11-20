import java.io.PrintStream;

public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        int avg = 6 ;
        int sem = (17 * 5) ;
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays
        int codingHours = (avg * sem);
            System.out.printf(String.valueOf(codingHours ));
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        int workHours;
        workHours = (52 * (5 * 17));
        System.out.printf(String.valueOf(codingHours % workHours ));

    }
}
