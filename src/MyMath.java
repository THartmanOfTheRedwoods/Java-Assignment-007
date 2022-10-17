import java.util.Scanner;

public class MyMath {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two integers to find GCF: ");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("The GCF is " + gcf(a, b));

    }

    public static int gcf(int a, int b) {
        while (b != 0)
            if (a > b) {
                int c = b;
                c = b;
                b = a % b;
                a = c;
            } else {
                b = b % a;
            }
        return a;
    }
    }

