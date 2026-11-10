package Loops;
import java.util.*;

public class printTheGivenSequence {
    static void main(String args[]) {
        System.out.println("Print the sequence 1, n, 2, n-1, 3, n-2 ....");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print(i+" "+(n-i+1)+" ");
        }
    }
}
