package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lottery {

    static int counter = 0;


    public static void main(String[] args) throws IOException {
        findMostUsedNumber(storeResult());
    }


    private static int[] findMostUsedNumber(int[] results) throws FileNotFoundException {
        int[] forFurtherAnalisys = new int[10];
        if (counter == 5) {
            return forFurtherAnalisys;
        }
        counter++;
        int maxOccurance = 0;
        //find maximum number of occurrences
        for (int i = 0; i < results.length; i++) {
            if (maxOccurance < results[i]) {
                maxOccurance = results[i];
            }
        }
        //find how many numbers have the same occurrence
        ArrayList<Integer> luckiestNumbers;
        luckiestNumbers = new ArrayList<>();
        int occurenceCounter = 0;
        for (int i = 0; i < results.length; i++) {
            if (results[i] == maxOccurance) {
                occurenceCounter += 1;
                luckiestNumbers.add(i);
                results[i] = 0;
            }
        }

        System.out.print("Number of occurances: " + maxOccurance + ". And the winner is /are :");
        for (Integer item : luckiestNumbers) {
            System.out.print(item + ", ");
        }
        System.out.println();
        forFurtherAnalisys = results;
        //return forFurtherAnalisys;
        findMostUsedNumber(forFurtherAnalisys);
        return forFurtherAnalisys;
    }

    public static int[] storeResult() throws FileNotFoundException {
        File file = new File("src/FileIO/lotto.txt");
        Scanner scanner = new Scanner(file);
        int[] results = new int[91];
        int itemAsInt = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            for (String item : line.split("Ft;")[4].split(";")) {
                itemAsInt = Integer.parseInt(item);
                results[itemAsInt] += 1;
            }
        }
        return results;
    }
}