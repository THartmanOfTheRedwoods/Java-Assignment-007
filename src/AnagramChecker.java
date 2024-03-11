import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {

    // Method to create a histogram of character occurrences in a string
    private static Map<Character, Integer> createHistogram(String str) {
        Map<Character, Integer> histogram = new HashMap<>();
        for (char ch : str.toCharArray()) {
            histogram.put(ch, histogram.getOrDefault(ch, 0) + 1);
        }
        return histogram;
    }

    // Method to check if two strings are anagrams of each other
    public static boolean areAnagrams(String str1, String str2) {
        // Create histograms for both strings
        Map<Character, Integer> hist1 = createHistogram(str1.toLowerCase());
        Map<Character, Integer> hist2 = createHistogram(str2.toLowerCase());

        // Check if histograms are equal
        return hist1.equals(hist2);
    }

    public static void main(String[] args) {
        // Test cases
        String word1 = "stop";
        String word2 = "pots";
        System.out.println(areAnagrams(word1, word2)); // Output: true

        String phrase1 = "allen downey";
        String phrase2 = "well annoyed";
        System.out.println(areAnagrams(phrase1, phrase2)); // Output: true

        String name1 = "christopher mayfield";
        String name2 = "hi prof the camel is dry";
        System.out.println(areAnagrams(name1, name2)); // Output: true

        String notAnagram1 = "hello";
        String notAnagram2 = "world";
        System.out.println(areAnagrams(notAnagram1, notAnagram2)); // Output: false
    }
}