import java.util.Arrays;
import java.util.Scanner;

    public class Sneakers {

        public static int[] sneakerLetterHist(String str) {
            int[] histogram = new int[26];
            str = str.toLowerCase();
            for (char c : str.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    histogram[c - 'a']++;
                }
            }
            return histogram;
        }
        public static boolean sneakerAreAnagrams(String str1, String str2) {
            int[] hist1 = sneakerLetterHist(str1);
            int[] hist2 = sneakerLetterHist(str2);
            return Arrays.equals(hist1, hist2);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first word: ");
            String word1 = scanner.nextLine();
            System.out.print("Enter second word: ");
            String word2 = scanner.nextLine();

            if (sneakerAreAnagrams(word1, word2)) {
                System.out.println(word1 + " and " + word2 + " are anagrams.");
            } else
                System.out.println(word1 + " and " + word2 + " are not anagrams.  'Setec Astronomy' and 'Too Many Secrets' are anagrams.");
        }
    }


