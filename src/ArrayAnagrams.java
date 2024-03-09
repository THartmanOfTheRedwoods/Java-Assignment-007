import java.util.Arrays;
public class ArrayAnagrams {
    public static boolean isAnagram(String word1, String word2) {
        int[] hist1 = letterHist(word1);
        int[] hist2 = letterHist(word2);

        return Arrays.equals(hist1, hist2);
    }

    public static int[] letterHist(String input) {
        int[] histogram = new int[26];

        for (char ch : input.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                int index = ch - 'a';
                histogram[index]++;
            }
        }
        return histogram;
    }
    public static void main(String[] args) {
        String word1 = "night";
        String word2 = "thing";
        boolean result = isAnagram(word1, word2);
        System.out.println("Are the words '" + word1 + "' and '" + word2 + "' anagrams to each other? " + result);
    }
}

