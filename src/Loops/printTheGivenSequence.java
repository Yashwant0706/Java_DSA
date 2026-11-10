package Loops;
import java.util.*;

public class printTheGivenSequence {
    static void main(String args[]) {
        System.out.println("Print the sequence 1, n, 2, n-1, 3, n-2 ....");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n : ");
        int n = sc.nextInt();

        int i = 1;
        int j = n;

        while(i <= j){
            System.out.print(i+" ");
            i++;

            if(i <= j){
                System.out.print(j+" ");
                j--;
            }
        }
    }
}
