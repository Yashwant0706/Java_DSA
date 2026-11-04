package IfElse_problems;
import java.util.*;

public class DivisibleBy5 {
    static void main(String args[]) {
        System.out.println("Divisible by 5 or not");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        if (n % 5 == 0){
            System.out.println("The Number "+n+" is divisible by 5");
        }
        else{
            System.out.println("The Number "+n+" is not Divisible by 5");
        }
    }
}