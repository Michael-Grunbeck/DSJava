//Michael Grunbeck
//Correction of code


public class DoubleMath {
    public static void main(String[] args) throws Exception{
        double a =1.2;
        double b=3.0;
        double c = a*b;
        double thresh=0.00000000001;
        double test = 3.6-c;

        if (test<=thresh){
            System.out.println("A times B is equal to 3.6");
        }
        else{
            System.out.println("They are not equal");
        }


    }
    
}
