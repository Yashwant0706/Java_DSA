package Loops;
import java.util.Scanner;

public class CountDigitsOfNum {
    static void main(String args[]) {
        System.out.println("Count the digits of number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int count = 0;

        while (n != 0 ){
            n /= 10;
            count++;
        }
        if(count == 0){
            count = 1;
        }
        System.out.println("Total digits are : "+count);
    }

}
