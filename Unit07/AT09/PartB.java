//Michael Grunbeck
import derryfieldmath.geometry;
import java.util.Scanner;

public class PartB {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the sphere's radius: ");
        double r = a.nextDouble();
        double surfaceArea = geometry.calcSurfaceareaofaSphere(r);
        double volume = geometry.calcvolumeofsphere(r);


        System.out.println("Your sphere with a radius of " + (int)r + ", has a surface area of " + (int)surfaceArea + " and a volume of " + (int)volume);

    }
}
