import java.util.Arrays;

public class AnagramChecker {
    public static boolean areAnagrams(String string1, String string2) {
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        int[] histogram1 = letterHist(string1);
        int[] histogram2 = letterHist(string2);

        return Arrays.equals(histogram1, histogram2);

    }
    public static int[] letterHist(String str) {
        int[] histogram = new int[26];
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                int index = ch - 'a';
                histogram[index]++;
            }
        }
        return histogram;
    }

    public static void main(String[] args) {
        //tests
        System.out.println(areAnagrams("stop", "pots")); //true
        System.out.println(areAnagrams("allen downey", "well annoyed")); //true
        System.out.println(areAnagrams("christopher mayfield", "hi prof the camel is dry")); //true

        System.out.println(areAnagrams("hello", "world")); //false
    }
}
