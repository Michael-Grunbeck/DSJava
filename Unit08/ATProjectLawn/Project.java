//Michael Grunbeck

import java.util.Scanner;

import lawn.Yard;


public class Project {

    // clears the screen
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
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

        scanner.close();
    }

}


