import java.util.Scanner;

public class MyMath {
    public static int greatestCommonFactor(int a, int b){
        while( b!=1){
            if (a>b){
                int c = b;
                b = a%b;
                a = c;
            }
            else{
                b = b % a;
            }
        }
        return a;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert first value: ");
        int a = scanner.nextInt();
        System.out.print("\nInsert second value: ");
        int b = scanner.nextInt();
        int greatest = greatestCommonFactor(a, b);
        System.out.println("The greatest common factor is " + greatest);
    }
}
