//Michael Grunbeck

import java.util.Scanner;

public class CougarBaking {
    public static void main(String[] args) throws Exception{
        final double COST = 0.99;
        Scanner a = new Scanner (System.in);
        System.out.print("How many cookies do you want to buy? ");
        double numcookies = a.nextDouble();
        double totalcost;
        totalcost=numcookies*COST;
        //This declares and initializes variables and asks the user for the amount of cookies they want to buy
        if(numcookies>=6 && numcookies<12){
            totalcost=totalcost*.975;
            

        }
        if (numcookies>=12 && numcookies < 24){
            totalcost=totalcost*.95;
            
        }
        if (numcookies>=24){
            totalcost=totalcost*.85;
            
        }
        //The string of if statements is applying discounts to if a customer purchased a certain amount of cookies 
        System.out.println("Your total comes out to $" + String.format("%.2f",totalcost));


    }
    
}
