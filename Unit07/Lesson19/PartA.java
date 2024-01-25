//Michael Grunbeck

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class PartA {
    public static void main(String[] args) throws FileNotFoundException {
        File infile = new File("temps.txt");
        Scanner a = new Scanner(infile);
        ArrayList<Integer> temperatures = new ArrayList<>();
        while (a.hasNext()) {
            int temperature = a.nextInt();
            temperatures.add(temperature);
            }        
        int lowesttemperature = Integer.MAX_VALUE;
        for (int temperature : temperatures) {
            if (temperature < lowesttemperature) {
                lowesttemperature = temperature;
            }
        }
        PrintWriter b = new PrintWriter("tempsOut.txt");
            for (int temperature : temperatures) {
                b.printf("%6d",temperature);
                if (temperature == lowesttemperature) {
                    b.print(" <= lowest");
                }
                b.println();
            }
        a.close();
        b.close();
    }
}