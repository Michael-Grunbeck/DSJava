//Michael Grunbeck

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartB {

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("characters.txt");
        Scanner in = new Scanner(inputFile);

        int totalcharacters = 0;
        int totalletters = 0;
        int totaldigits = 0;

        while (in.hasNext()) {
            String line = in.nextLine();
            
            for (char c : line.toCharArray()) {
                    totalcharacters++;
                    if (Character.isLetter(c)) {
                        totalletters++;
                    }
                    else if (Character.isDigit(c)) {
                        totaldigits++;
                    }
                    System.out.print(c);
                }
                System.out.println();
            }
            
            in.close();

        System.out.println("count = " + totalcharacters);
        System.out.println("letters = " + totalletters);
        System.out.println("digits = " + totaldigits);

    } 
}
