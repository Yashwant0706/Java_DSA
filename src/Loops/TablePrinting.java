package Loops;
import java.util.*;

public class TablePrinting {
    public static void main(String args[]){
        System.out.println("Table Printig");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of which you want the table : ");
        int n = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.print(i*n+" ");
        }
    }
}
