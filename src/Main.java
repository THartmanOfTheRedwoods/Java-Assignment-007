import java.util.Arrays;
public class Main {
    public static void main (String[] args) {
        System.out.println(Anagrams("stop", "pots"));
        System.out.println(Anagrams("allen downey", "well annoyed"));
        System.out.println(Anagrams("christopher mayfield", "hi prof the camel is dry"));
        System.out.println(Anagrams("hello", "world"));
    }
    public static boolean Anagrams(String str1, String str2) {
        char [] charArray1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char [] charArray2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
}
