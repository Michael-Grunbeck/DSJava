//Michael Grunbeck

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartB {
   public static void main(String[] args) {
       try {
           File file = new File("YearofBirth.txt");
           Scanner a = new Scanner(file);

           while (a.hasNextLine()) {
               String line = a.nextLine();
               int spaceIndex = line.indexOf(',');
               String name = line.substring(0, spaceIndex);
               String birthYearString = line.substring(spaceIndex + 1);

               try {
                   if (birthYearString != "n/a") {
                       int birthYear = Integer.parseInt(birthYearString);
                       System.out.println(name + " was born in " + birthYear + ".");
                   } else if (birthYearString == "n/a") {
                       System.out.println("I do not know what year " + name + " was born.");
                   }
               } catch (NumberFormatException e) {
                   System.out.println("Error finding birth year for " + name + ".");
               }
           }
       } catch (FileNotFoundException e) {
           System.out.println("File not found.");
       }
   }
}