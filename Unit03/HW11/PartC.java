package DSJava.Unit03.HW11;
//michael G.
import java.util.Scanner;

public class PartC{

public static double volume(double Radius){
    double r = Radius*Radius*Radius;
    double answer = r *(4.0/3)*Math.PI;
    return answer;

}

public static void main(String[] args) throws Exception{
    Scanner a = new Scanner (System.in);
    System.out.print("Please enter a radius ");
    double radius = a.nextDouble();
    double sphere = volume(radius);
    System.out.print("The volume of your sphere is " + sphere);
}
}
    

