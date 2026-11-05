package IfElse_problems;
import java.util.*;

//Take length and breadth of rectangle as input and check whether the area of rectangle is greater than the perimeter

public class AreaOfRectangle {
    static void main() {
        System.out.println("check whether area of Rectangle is greater than perimeter ");
        Scanner  sc =new Scanner(System.in);
        System.out.print("Enter the Length of Rectangle : ");
        int l = sc.nextInt();
        System.out.print("Enter the Breadth of Rectangle : ");
        int b = sc.nextInt();
        int Area = l*b;
        int Perimeter = 2*l + 2*b;

        if (Perimeter>Area){
            System.out.println("Perimeter of Rectangle is greater than Area");
        }
        else{
            System.out.println("Area of Rectangle is greater than perimeter");
        }
    }
}
