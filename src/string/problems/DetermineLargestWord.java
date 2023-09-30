package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement

        int maxLength = 0;
        String longestWord = "";

        for (Map.Entry<Integer, String> entry : wordNLength.entrySet()) {
            int length = entry.getKey();
            String word = entry.getValue();

            if (length > maxLength) {
                maxLength = length;
                longestWord = word;
            }
        }

        System.out.println(maxLength + " " + longestWord);
    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement

        String[] words = new String[0];
        for (String word : words) {
            // Remove punctuation marks if any
            word = word.replaceAll("[^a-zA-Z]", "");

            int length = word.length();

            if (!map.containsKey(length)) {
                map.put(length, word);
            }
        }
        return map;
    }
}
