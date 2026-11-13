package Loops;
import java.util.*;

public class CompositeNumber {
    public static void main(String args[]) {
        System.out.println("Check whether the number is composite number or not");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number n : ");
        int n = sc.nextInt();
        boolean flag = true; // True means the number is prime

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i==0){
                flag = false; // False means the number is Composite
                break;
            }
        }
        if(n==1) System.out.println("The number is neither prime not composite");
        else if(flag == false) System.out.println("The number is Composite");
        else System.out.println("The number is Prime");
    }
}
