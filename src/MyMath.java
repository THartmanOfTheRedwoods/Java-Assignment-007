import java.util.Scanner;

/**
 * Brennan Duffy
 * 10/11/2022
 */
public class MyMath {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("a: ");
        int a = s.nextInt();
        System.out.print("b: ");
        int b = s.nextInt();
        System.out.println("Greatest common factor: " + greatestCommonFactor(a, b));
    }

    /**
     * Retrieves the greatest common factor of two natural numbers
     * @param a natural number
     * @param b natural number
     * @return the greatest common factor
     */
    public static int greatestCommonFactor(int a, int b) {
        while (b != 0) {
            if (a > b) {
                int c = b;
                b = a % b;
                a = c;
            } else {
                b = b % a;
            }
        }
        return a;
    }
}

