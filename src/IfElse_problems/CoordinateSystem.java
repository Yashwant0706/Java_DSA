package IfElse_problems;
import java.util.*;

public class CoordinateSystem {
    static void main(String args[]) {
        System.out.println("Check in which quadrant the point lies");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x co-ordinate point : ");
        int x = sc.nextInt();
        System.out.print("Enter the y co-ordinate point : ");
        int y = sc.nextInt();

        if(x>0 && y>0){
            System.out.println("The point lies in the 1st quadrant");
        }
        else if(x<0 && y>0){
            System.out.println("The point lies in the 2nd quadrant");
        }
        else if(x<0 && y<0){
            System.out.println("The point lies in the 3rd quadrant");
        }
        else if(x>0 && y<0){
            System.out.println("The point lies in the 4th quadrant");
        }
        else if(x==0 && y!=0){
            System.out.println("The point lies on the y axis");
        }
        else if(x!=0 && y==0){
            System.out.println("The point lies on the x axis");
        }
        else if(x==0 && y==0){
            System.out.println("The point lies on the origin");
        }
    }
}
