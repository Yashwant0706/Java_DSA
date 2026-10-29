package Basics;
import java.sql.SQLOutput;
import java.util.*;

public class SqaureOfNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Sqaure of Number");
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int s = n*n;
        System.out.print("The Sqaure of number is : "+ s);
    }
}