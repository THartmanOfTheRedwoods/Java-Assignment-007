import java.util.Scanner;
/**
 *
 * @author Trevor Hartman
 * @author Eliot Rodriguez
 *
 * @since version 1.0
 * March 7, 2024
 *
 */
public class Anagram {
    public static int[] anagrams(String a, String b) {
        int[] anagrams = new int[];
        for ( int i =0; i<26;i++)
    }
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("input a word: ");
        String a = scanner.next();
        System.out.println("input a second word: ");
        String b = scanner.next();
        anagrams(a,b);
    }
}
