package Pattern_Printing;
import java.util.Scanner;

public class HalfNumTriangle {
    public static void main(String args[]){
        System.out.println("Half Number Triangle Printing");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth number until which you want to print : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
