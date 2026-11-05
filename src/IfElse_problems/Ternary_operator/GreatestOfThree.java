package IfElse_problems.Ternary_operator;
import java.util.*;

public class GreatestOfThree {
    static void main(String args[]) {
        System.out.println("Check which of three is greatest");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number : ");
        int b = sc.nextInt();
        System.out.print("Enter the 3rd number : ");
        int c = sc.nextInt();

        System.out.println((a>b)? ((a>c) ? a : c) : ((b>c) ? b : c));
    }
}
