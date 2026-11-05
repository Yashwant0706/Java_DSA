package IfElse_problems.Ternary_operator;
import java.util.*;

public class TernaryInVariable {
    static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int prasun = (n>=0) ? 100 : 0;
        System.out.print(prasun);
    }
}
