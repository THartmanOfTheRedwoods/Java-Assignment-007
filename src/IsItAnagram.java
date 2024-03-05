import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class IsItAnagram {
        public static boolean areAnagrams(String str1, String str2) {
            Map<Character, Integer> histogram1 = createHistogram(str1);
            Map<Character, Integer> histogram2 = createHistogram(str2);
            return histogram1.equals(histogram2);
        }
    private static Map<Character, Integer> createHistogram(String s) {
        Map<Character, Integer> histogram = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                histogram.put(c, histogram.getOrDefault(c, 0) + 1);
            }
        }
        return histogram;
    }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Take input from the user
            System.out.print("Enter the first expression: ");
            String str1 = scanner.nextLine().trim().toLowerCase();
            System.out.print("Enter the second expression: ");
            String str2 = scanner.nextLine().trim().toLowerCase();

            if (areAnagrams(str1, str2)) {
                System.out.println(str1 + " and " + str2 + " are anagrams.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams.");
            }
        }
}

