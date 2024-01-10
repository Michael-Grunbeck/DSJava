//Michael Grunbeck
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws Exception {
        double averagea = average(10, 8, 10);
        System.out.println("Average 1: " + averagea);

        double[] scores = {100, 90, 80, 100, 80};
        double averageb = average(scores);
        System.out.println("Average 2: " + averageb);
    }
    // Method to find the average
    public static double average(double... values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }

        return sum / values.length;
    }
}
