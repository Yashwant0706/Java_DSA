package Pattern_Printing;
import java.util.Scanner;

public class Rectangle {
    public static void main(String args[]){
        System.out.println("Star rectangle printing");
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number of columns : ");
        int c = sc.nextInt();
        System.out.print("Enter the number of rows : ");
        int r = sc.nextInt();

        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
