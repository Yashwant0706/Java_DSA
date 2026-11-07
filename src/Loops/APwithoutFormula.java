package Loops;
import java.util.*;

public class APwithoutFormula {
    static void main(String args[]) {
        System.out.println("Print Arithmetic Progression without Fromula");
        Scanner sc = new Scanner(System.in);
        System.out.print("How many terms do you want to print? : ");
        int n = sc.nextInt();

        int a = 4, d = 6;
        for(int i=1; i<=n; i++){
            System.out.print(a+" ");
            a += d;
        }
    }
}
