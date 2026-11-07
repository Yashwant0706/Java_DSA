package Loops;
import java.util.*;

public class ArithmeticProgression {
    static void main(String args[]) {
        System.out.println("Print the Arithmetic Progression");
        Scanner sc = new Scanner(System.in);
        System.out.print("How many terms do you want to print? : ");
        int n = sc.nextInt();

        for(int i = 2; i <= (3*n-1); i+=3){
            System.out.print(i+" ");
        }
    }
}

// Arithmetic Progression (AP) is a sequence of numbers in which the difference between consecutive terms is
// always constant
//   1. General Formula of AP
//           a, a+d, a+2d, a+3d,....
//     where,
//           a = First term
//           d = common difference
//           n = Number of terms

//   2. Important AP formulas
//     i)Common Difference
//              d = a2 - a1;

//     ii) nth Term of AP
//            an = a+(n-1)d

//     iii) Sum of first n Terms
//             Sn = n/2[2a+(n-a)d]

//     iv) Sum when first and last terms are known
//             Sn = n/2(a+l)
//        Where,
//              l = last term
//              a = first term
