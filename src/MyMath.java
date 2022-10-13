import java.util.Scanner;
/*
*@author Bridget Acosta
* 10/13/2022
 */
public class MyMath {
    //Use the flowchart above to implement a method gcf in the MyMath class
    // that calculates the greatest common factor of 2 numbers.

    private final static Scanner s = new Scanner(System.in);

    public static int gcf() {

        System.out.println("Type a number:");
        int a = Integer.parseInt(s.nextLine());
        System.out.println("Type a number:");
        int b = Integer.parseInt(s.nextLine());

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
        public static void main (String[]args) {
            System.out.println("GCF is: "+gcf());
            }
        }


