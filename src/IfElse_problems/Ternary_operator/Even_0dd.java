package IfElse_problems.Ternary_operator;
import java.util.*;

public class Even_0dd {
    static void main(String args[]) {
        System.out.println("Check whether the number is Even or Odd");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n : ");
        int n = sc.nextInt();

        System.out.println(n+" is "+((n%2==0) ? "Even number" : "Odd number"));
    }
}
