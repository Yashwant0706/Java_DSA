package Loops;

public class OddNoDivisibleBy3 {
    static void main(String args[]) {
        System.out.println("Print odd numbers between 1 to 100 divisible by 3");

        for(int i=1; i<=100 ; i++){
            if( i%2!=0 && i%3==0){
                System.out.print(i+" ");
            }
        }
    }
}
