//Michael Grunbeck

import java.util.Scanner;

import lawn.Yard;
import lawn.Mower;

public class Project {

    // clears the screen
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void delay(long mseconds) {
        try {
            Thread.sleep(mseconds);
        } catch (InterruptedException e) {
            System.err.println("InterruptedException received!");
        }
    }

    public static void main(String[] args) {
        clearScreen(); 

        
        Scanner scanner = new Scanner(System.in);

        // gets the dimesions of the lawn
        System.out.print("Enter the height of the yard: ");
        int height = scanner.nextInt();

        System.out.print("Enter the width of the yard: ");
        int width = scanner.nextInt();

        // creates the yard object
        Yard yard = new Yard(height, width);

        // prints out the yard object
        yard.printYard(); 

        

        System.out.print("Enter a starting row in your yard between 0 and " + (height - 1) + ": ");
        int mrow = scanner.nextInt();
        
        // Get column
        System.out.print("Enter a starting column in your yard between 0 and " + (width - 1) + ": ");
        int mcolumn = scanner.nextInt();

        // Get direction
        System.out.print("Enter a starting direction for your mower. 0 is up, 1 is right, 2 is down, 3 is left: ");
        int mdirection = scanner.nextInt();

        // Print yard with mower
        Mower mower = new Mower(mrow, mcolumn, mdirection);
        yard.printYard(mower);

        // cut one row.
        while (true) {
            mower.cutGrass(yard);
            if (mower.checkGrass(yard)) {
            mower.moveForward();
            } else { 
                break;
            }
            Project.clearScreen();
            yard.printYard(mower);
            Project.delay(500);
            

        }

       // mower.cutGrass(yard);
        scanner.close();
    }
    }




