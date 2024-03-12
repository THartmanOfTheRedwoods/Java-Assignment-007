public class AnagramChecker {

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        int[] hist1 = generateHistogram(str1);
        int[] hist2 = generateHistogram(str2);
        for (int i = 0; i < 26; i++) {
            if (hist1[i] != hist2[i]) return false;
        }
        return true;
    }

    private static int[] generateHistogram(String str) {
        int[] histogram = new int[26];
        for (char ch : str.toCharArray())
            if (Character.isLetter(ch)) histogram[ch - 'a']++;
        return histogram;
    }

    public static void main(String[] args) {
        String str1 = "stop", str2 = "pots";
        System.out.println(areAnagrams(str1, str2));
    }
}
