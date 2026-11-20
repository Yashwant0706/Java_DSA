package Pattern_Printing;
import java.util.Scanner;

public class AlphabetPatternByTypeCasting {
    public static void main(String args[]){
        System.out.println("Alphabet Pattern By Type Casting");
        Scanner sc = new Scanner(System.in);
        System.out.print("How many alphabet do you want to print? : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(i+64)+" "); // char convert numeric value to alphabet and (j+64) is equal to the asci value of char
            }
            System.out.println();
        }
    }
}
