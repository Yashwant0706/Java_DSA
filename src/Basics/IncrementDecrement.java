package Basics;

public class IncrementDecrement {
    static void main(String args[]) {
        int x = 10;
        int y = x++;
        System.out.println(x+" "+y);  //output is 11 10 because pehle x ki value use ki  jayegi and then increment hogi

        int m = ++x;
        System.out.println(x+" "+m); // output is 12 12 , x ki value pehle increment hogi aur phir use ki jayegi

        int k = 10;
        int l = k--;
        System.out.println(k+" "+l); // The post-decrement (k--) first assigns the original value of k (10) to l,
                                     // then decreases k by 1, so the output is 9 10.

        int n = 7;
        int p = --n;
        System.out.println(n+" "+p);  //The pre-decrement (--n) first decreases n by 1 and then assigns the updated value (6) to p.
    }
}
