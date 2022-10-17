import java.util.Scanner;

public class MyMath {

    public static Scanner scanman = new Scanner(System.in);


    public static int gcf(int a, int b) {

        int c = 0;

        while(b != 0) {
            if(a > b) {
                c = b;
                b = a % b;
                a = c;
            } else {
                b = b % a;
            }
        }
        return a;
    }


    public static void main(String[] args) {

        int input1 = 0;
        int input2 = 0;

        System.out.println("Input your first product: ");
        input1 = scanman.nextInt();
        System.out.println("Input your second product: ");
        input2 = scanman.nextInt();

        System.out.println("The greatest common factor is "+gcf(input1,input2));

    }
}
