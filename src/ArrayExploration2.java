/**
 * @author Jenny Li
 * @date 3/10/24
 * @Version 1.0
 */


import java.util.Scanner;
import java.util.Arrays;
public class ArrayExploration2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first word: ");
        String word = in.nextLine();
        System.out.print("Enter second word: ");
        String word1 = in.nextLine();

        word = word.toLowerCase();
        word1 = word1.toLowerCase();

        if(word.length() == word1.length()) {
            char[] charArray1 = word.toCharArray();
            char[] charArray2 = word1.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean answer = Arrays.equals(charArray1, charArray2);

            if(answer) {
                System.out.println(word + " and " + word1 + " are anagrams.");
            }
            else {
                System.out.println(word + " and " + word1 + " are not anagram");
            }
        }
        else {
            System.out.println(word + " and " + word1 + " are not anagrams.");
        }
    }
}
