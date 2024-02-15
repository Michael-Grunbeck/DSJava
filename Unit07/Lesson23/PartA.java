//Michael Grunbeck

import java.util.Scanner;

public class PartA{
    public static void main(String[] args) throws Exception{
     Scanner input = new Scanner(System.in);
        try {
            int quizScore = getQuizScore(input);
            System.out.println("Quiz score entered: " + quizScore);
        } catch (ArithmeticException e) {
            System.out.println("Invalid quiz score entered. Enter a value between 0 and 100.");
        }
    }

    public static int getQuizScore(Scanner in) {
        System.out.print("Enter quiz score (0-100): ");
        int score = in.nextInt();
        if (score < 0 || score > 100) {
            throw new ArithmeticException("Quiz score must be between 0 and 100.");
        }
        return score;
}
}