import java.util.Scanner;

public class MyMath {
static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int numberOne = s.nextInt();
        System.out.println("Enter another: ");
        int numberTwo = s.nextInt();

        while (numberTwo != 0){
            if (numberOne > numberTwo){
                int numberThree = numberTwo;
                numberTwo = numberOne % numberTwo;
                numberOne = numberThree;
            } else numberTwo = numberTwo % numberOne;
        }
        System.out.println("The GCF is: " + numberOne);
    }
}
