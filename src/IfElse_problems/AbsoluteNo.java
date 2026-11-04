package IfElse_problems;
import java.util.*;

public class AbsoluteNo {
    static void main(String args[]) {
        // Print the Absolute value of number : if no is positive then keep as it is and if , negative print its positive value
        System.out.println("Print the Absolute value of a number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

//        if(n>=0){
//            System.out.println(n);
//        }
//        else{
//            System.out.println(-n);
//        }

        // Jar Fakt if Statement use karun ya problem ch solution pahiije asel tr code asa asel
        if(n<0) n = -n;
        System.out.println(n);
    }
}


