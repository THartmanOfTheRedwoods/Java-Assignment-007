public class Anagram {

    public static void main(String[] args) {

        String s1 = "good";
        String s2 = "god";

        if (isAnagram(s1, s2)) {
            System.out.printf("The words \"%s\" and \"%s\" are anagrams.\n", s1, s2);
        } else {
            System.out.printf("The words \"%s\" and \"%s\" are not anagrams.\n", s1, s2);
        }
    }

    // compare the letter-count histogram of two strings
    // to determine if they are anagrams of each other
    public static boolean isAnagram(String s1, String s2) {

        boolean anagramFlag = true;
        if (s1.length() != s2.length()) {
            return !anagramFlag;
        }

        int[] s1Hist = letterHist(s1);
        int[] s2Hist = letterHist(s2);

        for (int i=0; i<s1Hist.length; i++) {
            if (s1Hist[i] != s2Hist[i]) {
                return !anagramFlag;
            }
        }
        return anagramFlag;
    }

    // method letterHist counts the number of times each
    // letter appears in each string
    public static int[] letterHist(String s) {
        String lower = s.toLowerCase();
        int[] alphaHist = new int[26];
        for (char letter : lower.toCharArray()) {
            int index = letter - 'a';
            alphaHist[index]++;
        }
        return alphaHist;
    }
}
