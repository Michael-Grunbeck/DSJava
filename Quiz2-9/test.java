//Michael Grunbeck

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test{
public static void main(String[] args) throws Exception{
    File inputFile = new File("billionaires.txt");
    Scanner in = new Scanner(inputFile).useDelimiter("[;\\s\\n]+");

    while (in.hasNextLine()){
        //Here we use scanner to get the lines
        String line = in.nextLine();
        Scanner lineScanner = new Scanner(line);
        lineScanner.useDelimiter("[;\\n]+");
        String name = lineScanner.next().trim();
        name=name.trim();
        String nextWord = lineScanner.next().trim();
        nextWord = nextWord.replaceAll("\\$", "");
        //Setting string toatal money to nextWord so we can modify nextword to after tax
        String money = nextWord;
        nextWord = nextWord.replaceAll(",", "");
        double networth = Double.valueOf(nextWord);
        //Calculating tax
        double aftertax = networth * .03;
        String country = lineScanner.next().trim();
        //Added .00 onto money string to fit formatting
        money = money + ".00";
        
         
        System.out.printf("%-17s: |$ %20s |$ %,16.2f | %-20s %n", name, money, aftertax, country);



    }
}
}