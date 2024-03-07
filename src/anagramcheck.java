import java.util.Arrays;

public class anagramcheck {
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] hist1 = createHistogram(str1);
        int[] hist2 = createHistogram(str2);
        return Arrays.equals(hist1, hist2);
    }

    public static int[] createHistogram(String str) {
        int[] histogram = new int[26];
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                histogram[c - 'a']++;
            }
        }
        return histogram;
    }
    public static void main(String[] args) {
        String word1 = "stop";
        String word2 = "pots";
        System.out.println(areAnagrams(word1, word2));
    }

}


