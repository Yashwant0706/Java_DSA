package IfElse_problems;
import java.util.*;

public class GreatestOfThree {
    static void main(String args[]) {
        System.out.println("Check which of three number is greatest");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number : ");
        int c = sc.nextInt();

        if(a>=b){
            if(a>=c){
                System.out.println("The greatest number is : "+a);
            }
            else{ // c>a
                System.out.println("The greatest number is : "+c);
            }
        }
        else{ //b>a
            if(b>=c){
                System.out.println("The greatest number is : "+b);
            }
            else{ //c>b
                System.out.println("The greatest number is : "+c);
            }
        }
    }
}
