import java.util.Scanner;

public class MyMath {

    public static int gcf(int a, int b) {
        int c = 0;
        while (true) {
            if (b != 0) {
                if (a > b) {
                    c = b;
                    b = a % b;
                    a = c;
                } else {
                    b = b % a;
                }
            } else {
                return c;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input two integer to check for the greatest common factor:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.printf("The greatest common factor of %d and %d is: %d",num1,num2,gcf(num1,num2));
    }
}
