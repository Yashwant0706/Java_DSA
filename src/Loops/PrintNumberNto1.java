package Loops;
import java.util.*;

public class PrintNumberNto1 {
    static void main(String args[]) {
        System.out.println("Print number N to 1");
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Number n : ");
        int n = sc.nextInt();

        for(int i=n; i>=1; i--){
            System.out.print(i+" ");
        }
    }
}
