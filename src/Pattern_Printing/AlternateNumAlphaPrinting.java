package Pattern_Printing;
import java.util.Scanner;

public class AlternateNumAlphaPrinting {
    public static void main(String args[]){
        System.out.println("Print Alternate Number and Alphabet printing");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n : ");
        int n =sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){

                if(i%2==0){
                    System.out.print((char)(j+64));
                }
                else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
