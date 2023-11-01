/*
 * Michael Grunbeck
 * 10/30
 * Mr. Eng
 */

public class HalfLife{
    public static void main(String[] args) throws Exception{
        double material = 100;
        int numyears = 0;
        while (material>=1){
            material = material/2;
            numyears=numyears+30;
            //While amount that calculates material by dividing it by 2 and adding 30 to years

        }
        System.out.print("The amount of material left is "+ String.format("%.2f",material)+"% and the time it took for this is "+numyears+" years");
    }//Prints out the amount of material
}