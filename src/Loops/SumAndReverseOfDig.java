package Loops;
import java.util.Scanner;

public class SumAndReverseOfDig {
    static void main(String args[]) {
        System.out.println("Sum and Reverse the number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int rev = 0;
        int sum = 0;

        while(n!=0){
            rev *= 10;
            rev += (n%10);
            sum += (n%10);
            n /= 10;
        }
        System.out.println("The Reversed number is "+rev+" sum of digits in number is "+sum);

    }
}
