package Basics;
import java.sql.SQLOutput;
import java.util.*;

public class VolumeOfSphere {
    static void main() {
        System.out.println("Volume of a Sphere");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of Sphere : ");
        double r = sc.nextDouble();

        double v = 1.3333 * 3.14 * r * r * r;
        System.out.println("Volume of Sphere = "+ v);

    }
}
