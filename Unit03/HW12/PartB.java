//Michael Grunbeck
//12/4
import java.util.Scanner;
public class PartB{
    public static double smallest (double x,double y, double z){
        if (x<y && x<z){
            return x;
        }
        else if (y<x && y<z){
            return y;
        }
        else if (z<y && z<x){
            return z;
        } else if(y==z&&y<x){
            return y;
        }else{
            return x;
        }

    }

    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter three numbers: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double small = smallest(a,b,c);
        System.out.println("The smallest number is "+small);

        
    }
}