import java.util.Scanner;

public class MyMath {
    public static int gcf(int x, int y) {
        if (x == 0) {
            return y;
        }
        if (y == 0) {
            return x;
        }
        if (x > y) {
            return gcf(x % y, y);
        } else {
            return gcf(x, y % x);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int y = scanner.nextInt();
        int gcf = gcf(x, y);
        System.out.println("The greatest common factor of " + x + " and " + y + " is " + gcf);
    }
}