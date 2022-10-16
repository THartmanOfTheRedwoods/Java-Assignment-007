import java.util.Scanner;

public class MyMath {
    static Scanner scoon = new Scanner(System.in);
    public static void euclidGCF(){
        System.out.println("Enter first number.");
        var a = Math.abs(scoon.nextDouble());
        System.out.println("Enter Second number.");
        var b = Math.abs(scoon.nextDouble());
        double c;
        // b != 0
        while (b != 0){
            if (a == 0){
                a = b;
                break;
            }
            else if (a > b) {
                c = b;
                b = a % b;
                a = c;
                continue;
            }
            b = b % a;
        }
        System.out.println("The greatest common factor is "+a);
    }
    public static void main(String[] args) {
        euclidGCF();
    }
}


//      Ignore method below. I finished it before I realised I had to use the Euclid's Algorithm.
//      I didn't delete it just in case I want to use it for something else.
    /*
    public static void gcf (){
        System.out.println("Enter first number.");
        var x = scoon.nextDouble();
        System.out.println("Enter Second number.");
        var y = scoon.nextDouble();
        Double i;
        if (Math.abs(x)>=Math.abs(y)){
            i = Math.abs(x);
        }else {
            i = Math.abs(y);
        }
        while ((y%i)!= 0 || x%i != 0){
            if (i==0){
                System.out.println("Not factorable. Try again");
                break;
            }
            i--;
        }
        System.out.println("The greatest common factor of "+x+" and "+y+" is "+i);

    }
    */
