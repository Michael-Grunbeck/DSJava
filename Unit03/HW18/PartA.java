//Michael Grunbeck
//HW18

 import java.util.ArrayList;
 import java.util.Scanner;
 
 public class PartA {
     public static void main(String[] args) {     
         ArrayList<String> names = new ArrayList<String>();
         Scanner input = new Scanner(System.in);
        //We loop for the users input of names
         while (true) {
             System.out.print("Enter names and press # to stop: ");
             String a = input.nextLine();
             if (a.equals("#")) {
                 break;
             }
             names.add(a);
         }     
         System.out.println("Your names: ");
         for (String name : names) {
             System.out.println(name);
         }         
     }    
 }