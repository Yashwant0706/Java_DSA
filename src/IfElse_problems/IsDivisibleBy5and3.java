package IfElse_problems;
import java.util.*;

//Take positive integer input and print
//        _____ if number is divisible by 5
//        _____ if number is divisible by 3
//        _____ if number is divisible by 5 & 3 both
//        _____ if number is not divisible by either 5 or 3


public class IsDivisibleBy5and3 {
    static void main(String args[]) {
        System.out.println("Check divisibility 5 and-or 3 ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if(n<0) n=-n;
        System.out.println(n);

        if(n%5==0){
            System.out.println("The number is divisible by 5");
        }
        if(n%3==0){
            System.out.println("The number is divisible by 3");
        }
        if(n%3==0 && n%5==0){
            System.out.println("The number is divisible by 5 and 3 both");
        }
        else{
            System.out.println("The number is not divisible by 5 or 3");
        }
    }
}
