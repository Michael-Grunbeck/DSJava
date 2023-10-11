//Michael Grunbeck
//10/11
//Mr. Eng


import java.util.Scanner;

//Imports Scanner to get the user input
public class Baking{
    public static void main(String[] args) throws Exception{
        Scanner a = new Scanner (System.in);
        System.out.print("How many pies do you want to buy: ");
        double pie = a.nextDouble();
        //This asks the user for how many pies they want to buy
        final double cost = 10.00;
        //This sets the cost for a pie
        double totalcost = cost*pie;
        //This calculates the total cost
        //System.out.print(totalcost);
        if (pie>=3){
            System.out.println("You get a 10% discount!");
            totalcost=totalcost*0.9;
            //If they buy more than 3 pies than they get a discount, so total cost equals .9 as it is a 10% discount
        }
        System.out.print("Your total comes out to: $" + totalcost);
        //This prints out the total cost for the consumer





    }
}