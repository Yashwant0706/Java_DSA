package Basics;
import java.sql.SQLOutput;
import java.util.Scanner;

public class SimpleIntrest {
    static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Intrest");
        System.out.print("Enter the principle amount : ");
        double p = sc.nextDouble();
        System.out.print("Enter the rate of Intrest : ");
        double r = sc.nextDouble();
        System.out.print("Enter the number of years : ");
        double n = sc.nextDouble();

        double I = p*r*n/100;
        System.out.print("The simple intrest is : "+I );
    }
}
