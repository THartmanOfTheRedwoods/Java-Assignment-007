import java.util.Arrays;

public class AnagramChecker {

    public static int[] letterHist(String sentence) {
        int[] letterFreq = new int[26];
        Arrays.fill(letterFreq, 0);
        String lcSentence = sentence.toLowerCase();
        for (int i = 0; i < lcSentence.length(); i++) {
            int index = (int) lcSentence.charAt(i) - 'a';
            if (index < 0 || index > 25) {
                continue;
            }
            letterFreq[index]++;
        }
        return letterFreq;
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Get histograms for both strings
        int[] hist1 = letterHist(str1);
        int[] hist2 = letterHist(str2);

        // Compare histograms
        return Arrays.equals(hist1, hist2);
    }

    public static void main(String[] args) {
        String str1 = "\"christopher mayfield\"";
        String str2 = "\"hi prof the camel is dry\"";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " \nand \n" + str2 + " \nare anagrams.");
        } else {
            System.out.println(str1 + " \nand \n" + str2 + " \nare not anagrams.");
        }
    }
}
