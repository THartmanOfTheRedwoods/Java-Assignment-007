public class ArrayExploration {
    public static int[] letterHist(String s) {
        int[] hist = new int[26];
        for (char c : s.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                hist[c - 'a']++;
            }
        }
        return hist;
    }

    public static boolean areAnagrams(String s1, String s2) {
        int[] hist1 = letterHist(s1);
        int[] hist2 = letterHist(s2);
        for (int i = 0; i < 26; i++) {
            if (hist1[i] != hist2[i]) {
                return false;
            }
        }
        return true;
    }
}
