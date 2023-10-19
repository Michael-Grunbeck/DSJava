import java.util.Scanner;

public class CougarCafeEnumerated {
public enum DayofWeek {MONDAY,OTHERDAY}
public enum AgeClass {JUNIOR,ADULT,SENIOR}
//This sets the enumerated types for days of the week and different age groups
    public static void main(String[] args) throws Exception{
        Scanner a = new Scanner(System.in);
        System.out.print("Is today Monday? (Type 0 if it is and 1 for if it is not) ");
        int val = a.nextInt();
        System.out.println("Juniors are under 13, Adults are over 13 and under 50, and seniors are 50 and older");
        Scanner age = new Scanner(System.in);
        System.out.print("What is the customers age?(0=Junior, 1=Adult, 2=Senior) ");
        int customerage = age.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.print("What is the total cost of the meal? ");
        double cost = b.nextDouble();
        //The Scanner questions ask the same questions, but ask for a response in a number which correlates to the enumerated type
        double totalcost;
        totalcost=0;

        if (val==0){
            if (customerage==0){
                totalcost=cost*.925;
            }
            if (customerage==2){
                totalcost=cost*.85;

            }
            if (customerage==1){
                totalcost=.95*cost;
            }
            //The if statements in the program use the enumerated values to check on if it is true or not, 
            //Then the apple the same discounts as before
        }
        if (val==1){
            if (customerage==0){
                totalcost=cost*.95;
            }
            if (customerage==2){
                totalcost=cost*.925;

            }
            if (customerage==1){
                totalcost=cost;
            }
            
        }
        System.out.print("The cost of their meal will be $"+totalcost);
        //Prints out cost of the meal
    }
}

