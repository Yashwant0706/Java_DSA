package IfElse_problems;
import java.util.*;

public class ProfitLoss {
    static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Profit-Loss Calculation");
        System.out.print("Enter the cost price : ");
        double cp = sc.nextDouble();
        System.out.print("Enter the Selling price : ");
        double sp = sc.nextDouble();

        if(cp>sp){
            double p = cp - sp;
            System.out.print(" you have made the loss of RS : " + p);
        }
        else if(sp>cp){
            double q = sp-cp;
            System.out.print("you have made the profit of RS : "+ q);
        }
        else {
            System.out.print(" you have sold the product in cost price , no profit");
        }
    }
}
