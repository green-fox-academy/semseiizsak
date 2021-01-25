package ParentFriendlyText;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(countSwear("src/ParentFriendlyText/content.txt"));
    }

    public static int countSwear(String filename){

        int count = 0;
        String cleanedText = "";

        try {
            File myFile = new File(filename);
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String inputString = myReader.nextLine();
                String[] swears = {"fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss", "cunt"};
                String[] words = inputString.split(" ");

                List<String> cleanedStrings = new ArrayList<>();

                for (int currentWord = 0; currentWord < words.length; currentWord++) {
                    boolean isSwear = false;
                    for (int j = 0; j < swears.length; j++) {
                        if(words[currentWord].toLowerCase().contains(swears[j])){
                            isSwear = true;
                            count++;
                        }
                    }
                    if(isSwear == false){
                        cleanedStrings.add(words[currentWord]);
                    }
                }

                for (int i = 0; i < cleanedStrings.size(); i++) {
                    cleanedText += cleanedStrings.get(i) + " ";
                }
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, there is no file to clean.");
            e.printStackTrace();
        }

        System.out.println(count);

        try {
            PrintWriter writer = new PrintWriter("/Users/semseiizsak/Documents/greenfox/semseiizsak/founfation_example_exam/content.txt", "UTF-8");
            writer.println(cleanedText);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return count;
    }
}

