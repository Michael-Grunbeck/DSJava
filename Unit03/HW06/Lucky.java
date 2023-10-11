//Michael G
//Correction of code

import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        System.out.print("What is your age? ");
        int age = input.nextInt();

        if (age==13){
            System.out.println("You are lucky!");

        } 
        else{
            System.out.println("You are " + age + " years old");
        }
        //This program asks for your age, then tests if you are 13 using an if statement to see if you are lucky 13
        //If you are luck 13 it prints you are lucky
    }
    
}
