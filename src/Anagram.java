import java.util.Arrays;

public class Anagram {
    public static boolean areAnagrams(String str1, String str2) {
        String word1 = Arrays.toString(letterHist(str1));
        String word2 = Arrays.toString(letterHist(str2));

        return word1.equals(word2);
    }

    public static int[] letterHist(String input) {
        int[] histogram = new int[26];

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                int index = Character.toLowerCase(ch) - 'a';
                histogram[index]++;
            }
        }

        return histogram;
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("stop", "pots"));
        System.out.println(areAnagrams("allen downey", "well annoyed"));
        System.out.println(areAnagrams("christopher mayfield", "hi prof the camel is dry"));
        System.out.println(areAnagrams("clearly not an anagram", "banana"));
    }
}
