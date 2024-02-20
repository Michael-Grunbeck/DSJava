//Michael Grunbeck

import java.util.Scanner;

import lawn.Yard;


public class Project {

    // clear screen
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        clearScreen(); // Clear the screen

        // Initalize Scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt user for dimensions of the lawn
        System.out.print("Enter the height of the yard: ");
        int height = scanner.nextInt();

        System.out.print("Enter the width of the yard: ");
        int width = scanner.nextInt();

        // Create Yard object
        Yard yard = new Yard(height, width);

        // Display Yard object
        yard.printYard(); 

        scanner.close();
    }

}


