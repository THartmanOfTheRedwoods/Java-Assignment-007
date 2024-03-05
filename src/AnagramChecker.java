import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //First string
        System.out.println("Enter the first text:");
        String str1 = scanner.nextLine();

        //Second string
        System.out.println("Enter the second text:");
        String str2 = scanner.nextLine();

        //Help from the Histogram Lab

        //Checking if valid
        boolean areAnagrams = true;
        int[] charCount = new int[26];

        //Counting in str1
        for (char c : str1.toCharArray()) {
            charCount[c - 'a']++;
        }

        //Counting in str2
        for (char c : str2.toCharArray()) {
            int count = charCount[c - 'a'];
            if (count == 0) {
                areAnagrams = false;
                break;
            }
            charCount[c - 'a']--;
        }

        //Checking if chars are processed
        for (int count : charCount) {
            if (count != 0) {
                areAnagrams = false;
                break;
            }
        }

        //Results
        if (areAnagrams) {
            System.out.println("These are anagrams.");
        } else {
            System.out.println("These are NOT anagrams.");
        }

        scanner.close();
    }
}




