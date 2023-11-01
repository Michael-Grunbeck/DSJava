//Michael Grunbeck
//10/30

import java.util.Scanner;

public class Intrest {
    public static void main(String[] args) throws Exception{
        Scanner a = new Scanner (System.in);
        System.out.print("What is the amount of money you start with? ");
        double money = a.nextDouble();
        System.out.print("What is the interest rate? ");
        double apr = a.nextDouble();
        System.out.print("How many years would you like to calculate the intrest rate for: ");
        int years = a.nextInt();
        int x = 0;
        double intrestEarned=0;
    //Asks the user for input to calculate the data    

    System.out.println("|  Year  |   Intrest Earned ($)   |  Total Balance ($)  |");
    System.out.println("_________________________________________________________");

    while(x<years){
        x=x+1;
        intrestEarned=(apr/100)*money;
        money=money+intrestEarned;
        System.out.println(String.format("|   %02d   |  %12.2f          |     %10.2f      |",x,intrestEarned,money));
        
//Calculates the nescarry data and puts it into a table
    }

    }

}
