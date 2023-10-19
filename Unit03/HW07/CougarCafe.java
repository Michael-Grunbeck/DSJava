//Michael Grunbeck

import java.util.Scanner;
//Imports scanner
public class CougarCafe {
    public static void main(String[] args) throws Exception{
        Scanner a = new Scanner(System.in);
        System.out.print("Is today Monday? (Type y for yes and n for no) ");
        String Monday = a.next();
        Scanner age = new Scanner(System.in);
        //Asks waiter if it is monday
        System.out.print("What is the customers age? ");
        int customerage = age.nextInt();
        //Uses scanner to ask the customers age
        Scanner b = new Scanner(System.in);
        System.out.print("What is the total cost of the meal? ");
        double cost = b.nextDouble();
        //Uses scanner to get the cost of the meal
        double totalcost;
        totalcost=0;
        //Initializes the variable total cost and sets it to start at zero

        if (Monday.toUpperCase().equals("Y")){
            if (customerage<13){
                totalcost=cost*.925;
            }
            if (customerage>=50){
                totalcost=cost*.85;

            }
            if (customerage<50 && customerage>=13){
                totalcost=.95*cost;
            }
            //This if statement is if it is monday, in the if statement, it sets the discounts for the certain age ranges
            
        }
        if (Monday.toUpperCase().equals("N")){
            if (customerage<13){
                totalcost=cost*.95;
            }
            if (customerage>=50){
                totalcost=cost*.925;

            }
            if (customerage<50 && customerage>=13){
                totalcost=cost;
            }
            //This is for if it is any other day, also applying the discounts
        }
        System.out.print("The cost of their meal will be $"+totalcost);
        //This prints out the total cost of the meal
    }
}