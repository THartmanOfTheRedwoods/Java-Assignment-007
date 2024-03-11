/**
 * @author Alexei Iachkov
 * @date 3-10-24
 * @version 1.0
 */

import java.util.Scanner;

public class Anagrams {
    public static boolean areAnagrams(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }

        int[] histogram1 = createHistogram(string1);
        int[] histogram2 = createHistogram(string2);

        for (int i = 0; i < 26; i++) {
            if (histogram1[i] != histogram2[i]) {
                return false;
            }
        }
        return true;
    }

    private static int[] createHistogram(String str) {
        int[] histogram = new int[26];
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                histogram[c - 'a']++;
            }
        }
        return histogram;
    }

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string1 = scanner1.nextLine();

        System.out.print("Enter another string to check if they are anagrams: ");
        String string2 = scanner1.nextLine();

        if (areAnagrams(string1, string2)) {
            System.out.println("The two strings are anagrams of each other, awesome!");
        } else {
            System.out.println("The two strings are not anagrams of each other, try again!");
        }
    }
}