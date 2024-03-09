/**
*@author Tyler Snyder
*@date 3/8/24
 */
import java.util.Arrays;
public class ArrayExploration2 {
    public static int[] letterHist(String string) {
        int histogram[] = new int[26];
        for (char character : string.toLowerCase().toCharArray()) {
            if (Character.isLetter(character)) {
                int index = character - 'a';
                histogram[index]++;
            }
        }
        return histogram;
    }

    public static boolean isAnagram(String string1, String string2 ) {
      String hist1 = Arrays.toString(letterHist(string1));
      String hist2 = Arrays.toString(letterHist(string2));
      return hist1.equals(hist2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("stop", "pots")); //true
        System.out.println(isAnagram("the morse code", "here come dots")); //true
        System.out.println(isAnagram("Tom Marvolo Riddle", "I am Lord Voldemort")); //true
        System.out.println(isAnagram("in the elf condom", "find the monocle")); //true - My wife's suggestion from 'American Dad'
        System.out.println(isAnagram("stop", "span")); // false
    }
}
