package Loops;
import java.util.Scanner;

public class FactorialOfNum {
    static void main(String[] args) {
        System.out.println("Factorial of a number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int fact = 1;
        for(int i =1; i<=n; i++){
            fact *= i;
            System.out.println("The factorial of number "+i+" is : "+fact);
        }
    }
}

// agar hum for loop ke bahar factorial print karvaye toh specific input liye gaye number ka factorial milega .
// aur ab jaise ki humne for loop factorial print karaya hai to woh 1 se lekar input liye wale number ke range mein factorial dega