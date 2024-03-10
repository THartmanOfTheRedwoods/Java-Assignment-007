public class ArrayExploration {

    public static boolean areAnagrams(String str1, String str2) {
        String cleanStr1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String cleanStr2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();


        if (cleanStr1.length() != cleanStr2.length()) {
            return false;
        }


        int[] letterCounts1 = new int[26];
        int[] letterCounts2 = new int[26];


        for (char c : cleanStr1.toCharArray()) {
            letterCounts1[c - 'a']++;
        }
        for (char c : cleanStr2.toCharArray()) {
            letterCounts2[c - 'a']++;
        }


        for (int i = 0; i < 26; i++) {
            if (letterCounts1[i] != letterCounts2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("stop", "pots"));
        System.out.println(areAnagrams("allen downey", "well annoyed"));
        System.out.println(areAnagrams("christopher mayfield", "hi prof the camel is dry"));
        System.out.println(areAnagrams("hello", "world")); 
    }
}
