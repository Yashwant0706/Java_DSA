package IfElse_problems;
import java.util.*;

public class percentProfitLoss {
    static void main(String args[]) {
        System.out.println("Calculate % profit-loss ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price : ");
        double cp = sc.nextDouble();
        System.out.println("Enter the selling price : ");
        double sp = sc.nextDouble();

        if(sp>cp){
            double profit = sp - cp ;
            double p = (profit/cp)*100;
            System.out.println("The profit gained is : "+p+"%");
        }
        if(sp<cp){
            double loss = cp - sp ;
            double l = (loss/cp)*100;
            System.out.println("The loss gained is : "+l+"%");
        }
        else{
            System.out.println("No profit or loss");
        }
    }
}
