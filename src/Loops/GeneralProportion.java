package Loops;
import java.util.*;

public class GeneralProportion {
    static void main(String args[]) {
        System.out.println("Print the General Proportion 1,2,4,8...");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term upto which you want print : ");
        int n = sc.nextInt();

        int a = 1, r = 2;
        for(int i=1; i<=n; i++ ){
            System.out.print(a+" ");
            a *= r;
        }
    }
}

//nth Term Formula of Geometric Progression (GP)
//
//    an = a*r^(n-1)
//Where
//     a = first term
//     r = Common ratio
//     n = Position of the term
//     an = nth term
