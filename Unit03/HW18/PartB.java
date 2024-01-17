//Michael Grunbeck
import java.util.ArrayList;
import java.util.Scanner;
public class PartB {
    public static void main(String[] args) throws Exception {
        ArrayList<Double> scores = new ArrayList<Double>();
        Scanner input = new Scanner(System.in);
        int numscores = 0;
        double totscores = 0;
        while (true) {
            System.out.print("Enter quiz scores or type 'q' to quit: ");
            if (input.hasNext("q") || input.hasNext("Q")) {
                input.next();
                break;
            } else {
                double a = input.nextDouble();
                scores.add(a);
                totscores += a;
                numscores++;
            }
        }
        System.out.println("Test scores that you entered:");
        for (Double score : scores) {
            System.out.printf("%.2f%n", score);
        }
        if (numscores > 0) {
            double averagescore = totscores / numscores;
            System.out.printf("Average score: %.2f%n", averagescore);
        } else {
            System.out.println("No scores entered.");
        }
    }
}