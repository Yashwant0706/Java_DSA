package Loops;
import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String args[]){
        System.out.println("Print all the factors of number");
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("The factors of number "+n+" are : ");

        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n%i==0) {
                System.out.print(i + " ");
                if (i != n / i) {
                    System.out.print(n / i + " ");
                }
            }
        }
    }
}
