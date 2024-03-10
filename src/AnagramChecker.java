import java.util.Arrays;

public class AnagramChecker {

    // could return bool for other logic, but unnecessary with this model.
    public static void areAnagrams(String str1, String str2) {
        // remove whitespace and convert to lowercase.
        // create new String variable to preserve original format for print statement.
        String formattedString1 = str1.replaceAll("\\s", "").toLowerCase();
        String formattedString2 = str2.replaceAll("\\s", "").toLowerCase();

        // check if the sorted characters in both strings are the same
        char[] charArray1 = formattedString1.toCharArray();
        char[] charArray2 = formattedString2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams!");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    public static void main(String[] args) {

        areAnagrams("Debit card", "Bad credit");
        areAnagrams("Washington", "Benjamin");
        areAnagrams("The eyes", "They see");
        areAnagrams("Color", "Colour");

    }
}
