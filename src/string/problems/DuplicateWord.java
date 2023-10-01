package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        String[] words = st.split("\\s+");

        // Create a map to store words and their occurrences
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Variables to calculate the total length of words
        int totalLength = 0;
        int wordCount = 0;

        for (String word : words) {
            // Remove punctuation marks and convert to lowercase (optional)
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            // Update word occurrences in the map
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);

            // Update total length
            totalLength += word.length();
            wordCount++;
        }

        // Calculate average length
        double averageLength = (double) totalLength / wordCount;

        // Print duplicate words and their occurrences
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Word: " + entry.getKey() + ", Occurrences: " + entry.getValue());
            }
        }

        System.out.println("Average Word Length: " + averageLength);
    }

}
