import java.util.Scanner;

public class ArrayExploration2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first word(s):");
        String string1 = scanner.nextLine();

        System.out.println("Enter second word(s):");
        String string2 = scanner.nextLine();

        int[] count1 = countLetters(string1);
        int[] count2 = countLetters(string2);

        if (areAnagrams(count1, count2)) {
            System.out.println(string1 + " and " + string2 + " are anagrams.");
        } else {
            System.out.println(string1 + " and " + string2 + " are not anagrams.");
        }

        scanner.close();
    }

    public static int[] countLetters(String text) {
        if (text == null || text.isEmpty()) {
            return new int[26]; // Return empty histogram for empty string
        }

        int[] counts = new int[26];


        for (char c : text.toCharArray()) {
            int index = Character.toLowerCase(c) - 'a';
            if (index >= 0 && index < 26) {
                counts[index]++;
            }
        }

        return counts;
    }

    public static boolean areAnagrams(int[] count1, int[] count2) {
        // Check if the counts for each letter are equal
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }

        return true;
    }
}
