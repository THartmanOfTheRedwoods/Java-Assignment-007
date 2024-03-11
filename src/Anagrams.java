public class Anagrams {

    public static boolean anagram(String w1, String w2){

        w1 = w1.toLowerCase();
        w2 = w2.toLowerCase();

        if (w1.length() != w2.length()){
            return false;
        }

        int[] anag = new int[26];

        for (char letter : w1.toCharArray()) {
            int index = letter - 'a';
            anag[index]++;

        }
        for (char letter : w2.toCharArray()){
            int index = letter -'a';
            if (anag[index] == 0) {

                return false;
            }
            index = letter - 'a';
            anag[index]--;

        }
        return true;
    }

    public static void main(String[] args) {
        String w1 = "stopp";
        String w2 = "pots";
        System.out.println(anagram(w1, w2));

    }
}
