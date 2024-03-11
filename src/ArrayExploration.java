import java.util.Scanner;
import java.util.Arrays;

public class ArrayExploration {
    public static boolean areAnagrams(String word1, String word2) {
        word1 = word1.replaceAll("\\s", "").toLowerCase();
        word2 = word2.replaceAll("\\s", "").toLowerCase();
        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first word:");
        String word1 = scanner.nextLine();
        System.out.println("Enter the second word:");
        String word2 = scanner.nextLine();

        if (areAnagrams(word1, word2)) {
            System.out.println("The words are anagrams of each other.");
        } else {
            System.out.println("The words are not anagrams of each other.");
        }
        testWords();
        scanner.close();
    }

    public static void testWords() {
        String[][] testCases = {
                {"stop", "pots"},
                {"allen downey", "well annoyed"},
                {"christopher mayfield", "hi prof the camel is dry"}
        };

        for (String[] testCase : testCases) {
            String word1 = testCase[0];
            String word2 = testCase[1];
            if (areAnagrams(word1, word2)) {
                System.out.println(word1 + " and " + word2 + " are anagrams of each other.");
            } else {
                System.out.println(word1 + " and " + word2 + " are not anagrams of each other.");
            }
        }
    }
}