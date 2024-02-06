//Michael Grunbeck

 import java.io.File;
 import java.io.FileNotFoundException;
 import java.util.Scanner;
 
 public class PartB {
     public static void main(String[] args) throws FileNotFoundException {
 
         File inputFile = new File("sales.txt"); 
         Scanner a = new Scanner(inputFile).useDelimiter("[,\\s\\n]+");
 
        while (a.hasNextLine()) {
            String line = a.nextLine();
            Scanner lineScan = new Scanner(line);
            lineScan.useDelimiter("[,\\n\\s ]+");
            String catag = lineScan.next();
            String name = lineScan.next();
            double sales;
            if (lineScan.hasNextDouble()) {
                sales = lineScan.nextDouble();
            } else {
                lineScan.next();
                sales = 0.0;
            }
            System.out.printf("%-17s | %-10s | $%10.2f%n", catag, name, sales);
        }

    }
}
