package Loops;

public class EvenNo1to100 {
    static void main() {
        System.out.println("Print even numbers between 1 to 100");
        for (int i = 1; i <= 100 ; i++) {
            if(i%2==0) System.out.println(i+" ");
        }
    }
}
