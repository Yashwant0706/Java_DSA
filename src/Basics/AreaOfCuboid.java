package Basics;
import java.util.*;

public class AreaOfCuboid {
    static void main() {
        System.out.println("Area of Cuboid");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        double l = sc.nextDouble();
        System.out.print("enter the breadth : ");
        double b = sc.nextDouble();
        System.out.print("Enter the height : ");
        double h = sc.nextDouble();

        double Area = 2*(l*b + b*h + l*h);
        System.out.println("Area of Cuboid is "+Area);
    }
}
