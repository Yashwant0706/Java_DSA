package IfElse_problems;
import java.util.*;

public class EvenOdd {
    static void main(String args[]) {
        System.out.println("Check number if it Even or Odd");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        if(n%2==0){
            System.out.println("The Number "+n+" is Even.");
        }
        else{
            System.out.println("The Number "+n+" is Odd.");
        }
    }
}
