//Michael Grunbeck

import java.util.Scanner;


public class PartA {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double[] scores = new double[100]; 
        int count = 0;

        // Get the scores
        while (true) {
            System.out.print("Enter quiz scores and type 'q' to quit: ");
            if (a.hasNext("q") || a.hasNext("Q")) {
                a.next();
                break;    
            } else {
                scores[count] = a.nextInt();
                count++;
            }
        }
        
        // Finding the min value
        double min = scores[0];
        System.out.print("Values entered: ");
        for (int i = 0; i < count; i++) {
            System.out.print(scores[i]);
            if (i < count - 1) {
                System.out.print(", ");
            }
            if (scores[i] < min) {
                min = scores[i];
            }
        }

        // Print out and show the user
        System.out.println();
        System.out.printf("The Lowest value is %.2f%n", min);

        // drop lowest if wanted
        System.out.println("Would you like to drop the lowest test score? If you do, type 'y'. ");
        if (a.hasNext("y") || a.hasNext("Y")) {
            a.next(); 
            count = dropLow(scores, count, min);
            System.out.print("Quiz Scores after dropping: ");
            for (int i = 0; i < count; i++) {
                System.out.print(scores[i]);
                if (i < count - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
    // method to drop the 
    private static int dropLow(double[] scores, int count, double min) {
        // drop lowest score
        int index = -1;
        for(int i = 0; i < count; i++) {
            if (Math.abs(min - scores[i]) < 0.00000001) {
                index = i;
                break;
            }
        }

        if (index >=0) {
            for(int i = index + 1; i < count; i++) {
                scores[i - 1] = scores[i];
            }
        }
        count = count - 1;
        return count;
    }
}