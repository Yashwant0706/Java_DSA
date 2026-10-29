package Basics;
import java.util.*;

public class SumOfTwo {
    static void main(String args[]) {
        System.out.println("Addition of Two Numbers");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b ;
        System.out.print("The sum of two numbers is = "+ c);
    }
}
