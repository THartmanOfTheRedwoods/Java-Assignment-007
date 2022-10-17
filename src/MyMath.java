/**
 * @author Joseph Freedman
 *
 * The MyMath class asks the user for two numbers and returns the Greatest Common Factor of them.
 */

import java.util.Scanner;

public class MyMath {

    /**
     * @gcf This is the gcf method that takes two parameters and returns the GCF.
     * @param a is the first integer.
     * @param b is the second integer.
     * @return c is the common factor and is returned.
     */
    public static int gcf (int a, int b) {
        int c = 0;
        while (b != 0) {
            if (a > b) {
                c = b;
                b = a % b;
                a = c;
            } else {
                b = b % a;
            }
        }
        return c;
    }

    /**
     * @main This is our main method.
     *
     * We are asking the user to input two numbers here and return the GCF.
     *
     */
    public static void main(String[] args) {
        //Ask the user to input two numbers.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second integer: ");
        int b = scanner.nextInt();

        //Return the GCF
        int returnValue =  gcf(a, b);
        System.out.println("The GCF is " + returnValue);
    }
}
