import java.util.Arrays;


public class anagramCheck {


    public static boolean isAnagram(String a, String b) {

        char wordOne[] = a.toCharArray();
        char wordTwo[] = b.toCharArray();

        int[] counts = new int[26];

        int n1 = wordOne.length;
        int n2 = wordTwo.length;

        if (n1 != n2) {
            return false;
        }

        Arrays.sort(wordOne);
        Arrays.sort(wordTwo);

        for (char letter : wordOne) {
            int index = letter - 'a';
            counts[index]++;
        }
        for(char letter : wordTwo){
            int index = letter - 'a';
            counts[index]++;
        }

        for (int count : counts) {
            if (count != 0 && count != 2) {
                return false;
            }
        }

        return true;
    }


    public static void main(String args[]) {


        if (isAnagram("pots", "stop"))
            System.out.println("The two strings are anagram of each other");
        else
            System.out.println("The two strings are not anagram of each other");
    }
}

