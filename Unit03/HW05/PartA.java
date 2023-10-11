import java.util.Scanner;
//Imports scanner in order to ask the user for their input

public class PartA {
    public static void main(String[] args) throws Exception {
    Scanner a = new Scanner(System.in);
    System.out.print("What is your full name? ");
    //Asks the user for its name
    String first = a.next();
    String middle = a.next();
    String last = a.next();
    //Creates strings for each name
    System.out.println(first);
    System.out.println(middle);
    System.out.println(last);

    String monogram = first.substring(0,1) + middle.substring(0,1) + last.substring(0,1);
   //Creates the string monogram, which is comprised of the first letter of each string, which is done by substring
    System.out.println((String)monogram);
    //Prints out monogram

    
    }
}
