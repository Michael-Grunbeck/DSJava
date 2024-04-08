//Michael Grunbeck
//4/8
import org.derryfield.toys.Magic8ball;
import java.util.Scanner;

public class PartD {
    public static void main(String[] args) {

        Magic8ball magic8Ball = new Magic8ball();
        Scanner in = new Scanner(System.in);
        String input;

        do {
            System.out.print("What is your question? (press q to quit): ");
            input = in.nextLine();

            if (!input.equalsIgnoreCase("q")) {
                magic8Ball.getanswer();
                System.out.println("The 8 Ball says: " + magic8Ball.getanswer());
            }

        } while (!input.equalsIgnoreCase("q"));

        System.out.println("Exiting the program");
        
        in.close();

    }
}
