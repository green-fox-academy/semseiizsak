
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import java.applet.*; 
import java.awt.*;

public class moviePicker {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

        public static void movieGetter(){
            Scanner scanner = new Scanner(System.in);
            List<String> movieList =new ArrayList();

            System.out.println("Please enter some films bellow: ");

            while (true) {

                String movie = scanner.nextLine();

                if (movie.isBlank()) {
                    break;
                }
                movieList.add(movie);
            }

            System.out.println("Thanks, let me pick one for you: ");

            moviePicker obj = new moviePicker();

            System.out.println("\nOur pick for you: " + (ANSI_RED + getRandomElement(movieList) + ANSI_RESET));
        }

    public static String getRandomElement(List<String> list)
    {
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }

    public static void main(String[] args) {
        movieGetter();
    }

}
