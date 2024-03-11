import java.util.Arrays;

public class ArrayExploration {
    public static void main(String[] args) {
        String s1 = "Rigel";
        String s2 = "Star";
        System.out.println(compareHist(s1, s2));
    }

    public static boolean compareHist(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] histogram1 = letterHist(s1);
        int[] histogram2 = letterHist(s2);

        return Arrays.equals(histogram1, histogram2);
    }

    public static int[] letterHist(String s) {
        int[] histogram = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c >= 'a' && c <= 'z') {
                histogram[c - 'a']++;
            }
        }

        return histogram;
    }
}