package IfElse_problems;
import java.util.*;

public class SidesOfTriangle {
    static void main(String args[]) {
        System.out.println("Check if the sides are of triangle or not");
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the side a : ");
        int a = sc.nextInt();
        System.out.print("Enter the side b : ");
        int b = sc.nextInt();
        System.out.print("Enter the side c : ");
        int c = sc.nextInt();

        if(a+b>c && a+c>b && b+c>a){
            System.out.println("Valid sides of Triangle");
        }
        else{
            System.out.println("Invalid sides of Triangle");
        }
    }
}
