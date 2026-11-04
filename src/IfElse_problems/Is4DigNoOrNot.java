package IfElse_problems;
import java.util.*;

public class Is4DigNoOrNot {
    static void main(String args[]) {
        System.out.println("Check whether the number is of 4 digit or not ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if(n>999 && n<10000){
            System.out.println("The number is of 4 digits");
        }
        else{
            System.out.println("The number is not of 4 digits");
        }
    }
}
