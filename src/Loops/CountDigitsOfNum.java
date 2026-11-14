package Loops;
import java.util.Scanner;

public class CountDigitsOfNum {
    static void main(String args[]) {
        System.out.println("Count the digits of number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
                           //  if(n==0) n=7;   7 just ek ek random number hai jo ki assign kiya hai count output ke liye
        int count = 0;     //  ^
                           //  |
        while (n != 0 ){   //  |
            n /= 10;       //  |
            count++;       //  |
        }                  //  |
        if(count == 0){    // iska ek alternate option bhi hai agar number 0 input diya jaye to n ko certain value
            count = 1;     // assign kar denge jisse ki input 0 dene par count 1 aayega
        }
        System.out.println("Total digits are : "+count);
    }

}
