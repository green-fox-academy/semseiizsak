package anagram;

import java.util.ArrayList;
import java.util.List;

public class Anagram {
    public static List<Character> uniqueLetters(String inputString){
        //char [] uniqueLetters = new char[];

        char[] letters = inputString.toCharArray();
        List<Character> uniqueLetters = new ArrayList<>();


        for (int i = 0; i < letters.length; i++) {
            int repeatCount = 0;
            for (int j = 0; j < letters.length; j++) {
                if(letters[i] == letters[j]){
                    repeatCount++;
                }
            }
            if(!uniqueLetters.contains(letters[i]) && !(repeatCount > 1)){
                uniqueLetters.add(letters[i]);
            }
        }
        return uniqueLetters;
    }



    public static void main(String[] args) {
        System.out.println(uniqueLetters("anagram"));
        System.out.println(uniqueLetters("randomrandi"));
    }
}
