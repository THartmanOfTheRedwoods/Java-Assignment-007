import java.util.Arrays;

public class AnagramCheck {
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] histogram1 = letterHist(str1);
        int[] histogram2 = letterHist(str2);

        return Arrays.equals(histogram1, histogram2);
    }
    public static int[] letterHist(String str) {
        int[] histogram = new int[26];
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                int index = Character.toLowerCase(ch) - 'a';
                histogram[index]++;
            }
        }
        return histogram;
    }
    public static void main(String[] args) {
        String word1 = "stop";
        String word2 = "pots";
        if (areAnagrams(word1, word2)) {
            System.out.println("\"" + word1 + "\" and \"" + word2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + word1 + "\" and \"" + word2 + "\" are not anagrams.");
        }
    }
}

