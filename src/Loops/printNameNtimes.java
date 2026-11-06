package Loops;
import java.util.*;

public class printNameNtimes {
    static void main(String args[]) {
        System.out.println("Print yashwant n times, taking n input from user ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Yashwant");
        }
    }
}
