/**
 *
 * @author Diego Carrera
 * Date: 3/18/2024
 *
 */

public class ArrayExploration2 {
    public static void main(String[] args) {
        String One = "Cool";
        String Two = "loco";
        System.out.println(One + " is an anagram of " + Two + ": "+ isAnagram(One, Two));
    }

    public static boolean isAnagram(String s1, String s2) {
        // Create histograms to count occurrences of each letter and in turn work as an anagram checker
        int[] histogramOne = new int[26];
        int[] histogramTwo = new int[26];

        // Histogram for string s1
        for (int i = 0; i < s1.length(); i++) {
            char letter = s1.toLowerCase().charAt(i);
            if (letter >= 'a' && letter <= 'z') {
                histogramOne[letter - 'a']++;
            }
        }
        //Histogram for String s2
        for (int i = 0; i < s2.length(); i++) {
            char letter = s2.toLowerCase().charAt(i);
            if (letter >= 'a' && letter <= 'z') {
                histogramTwo[letter - 'a']++;
            }
        }

        // Check if histograms are equal
        for (int i = 0; i < 26; i++) {
            if (histogramOne[i] != histogramTwo[i]) {
                return false; // If counts of any letter differ; not an anagram
            }
        }

        return true; // If histograms are equal; strings are anagrams
    }
}

