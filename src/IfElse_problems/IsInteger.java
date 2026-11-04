package IfElse_problems;
import java.util.*;

public class IsInteger {
    static void main(String args[]) {
        System.out.println("Check number if integer or not ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer number : ");
        double n = sc.nextDouble();

        if(n == (int)n){
            System.out.println("The number "+n+" is an Integer");
        }
        else{
            System.out.println("The number "+n+" is not an Integer");
        }
    }
}
