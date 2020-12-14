package Anagram;

import java.util.ArrayList;

public class Anagram {

    public static boolean anagramms(String word1, String word2){
        if(word1.length() != word2.length()){
            return false;
        } else {
            ArrayList<Character> word1ArrayList = new ArrayList<>();
            ArrayList<Character> word2ArrayList = new ArrayList<>();

            for (int i = 0; i < word1.length(); i++) {
                word1ArrayList.add(word1.charAt(i));
                word2ArrayList.add(word2.charAt(i));
            }

            word1ArrayList.

            return word1ArrayList.equals(word2ArrayList);
        }
    }

    public static void main(String[] args) {
        System.out.println(anagramms("kika", "kaki"));
    }
}
