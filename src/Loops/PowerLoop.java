package Loops;
import java.util.Scanner;

public class PowerLoop {
    public static void main(String args[]){
        System.out.println("Calculate the power of number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        System.out.print("Enter the power of number : ");
        int b = sc.nextInt();
        int pow = 1;

        for(int i=1; i<=b; i++){
            pow *= a;
        }
        System.out.println(a+" raised to the power "+b+" is "+pow);
    }
}
