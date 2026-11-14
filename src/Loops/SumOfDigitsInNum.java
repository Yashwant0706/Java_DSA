package Loops;
import java.util.Scanner;

public class SumOfDigitsInNum {
    static void main(String args[]) {
        System.out.println("Give the Sum of digits in a number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if( n<0) n = -n;

        int sum = 0;

        while(n != 0 ){
            sum  += (n%10);
            n = n/10;
        }
        System.out.println("Sum of digits : "+sum);
    }
}
