import java.util.Arrays;
public class Anagrams {

        public static boolean areAnagrams(String str1, String str2) {
            String cleanStr1 = str1.replaceAll("\\s", "").toLowerCase();
            String cleanStr2 = str2.replaceAll("\\s", "").toLowerCase();
            if (cleanStr1.length() != cleanStr2.length()) {
                return false;
            }
            int[] hist1 = letterHist(cleanStr1);
            int[] hist2 = letterHist(cleanStr2);
            return Arrays.equals(hist1, hist2);
        }
        public static int[] letterHist(String str) {
            int[] histogram = new int[26];
            for (char ch : str.toCharArray()) {
                if (Character.isLetter(ch)) {
                    histogram[ch - 'a']++;
                }
            }
            return histogram;
        }

        public static void main(String[] args) {
            String word1 = "stop";
            String word2 = "pots";
            System.out.println(word1 + " and " + word2 + " are anagrams: " + areAnagrams(word1, word2));
            String phrase1 = "allen downey";
            String phrase2 = "well annoyed";
            System.out.println(phrase1 + " and " + phrase2 + " are anagrams: " + areAnagrams(phrase1, phrase2));
            String name1 = "christopher mayfield";
            String name2 = "hi prof the camel is dry";
            System.out.println(name1 + " and " + name2 + " are anagrams: " + areAnagrams(name1, name2));
        }
    }

