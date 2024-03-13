//Michael Grunbeck
//3/13
public class PartA {
    public static void main(String[] args) throws Exception {
        // Is always the same
        double pi = Math.PI;
        System.out.println("Pi: " + pi);

        // Depends on the number in the (), a method
        double sqrt = Math.sqrt(25); 
        System.out.println("Square root of 25: " + sqrt);

        System.out.println("The square root of 25 + pi is " + (pi+ sqrt));
    }
}