//Michael Grunbeck

import java.util.Scanner;

import lawn.Yard;
import lawn.Mower;

public class Project {

//method for clearing screen
public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    }

// method delay yard
public static void delay(long mseconds) {
    try {
        Thread.sleep(mseconds);
    } catch (InterruptedException e) {
        System.err.println("Interrupted Exception received!");
        }
    }

public static void main(String[] args) {
    clearScreen(); // Clear the screen

   
    Scanner in = new Scanner(System.in);

    //Get Dimensions
    System.out.print("Enter the height of the yard: ");
    int height = in.nextInt();

    System.out.print("Enter the width of the yard: ");
    int width = in.nextInt();

    //Create Yard
    Yard yard = new Yard(height, width);

    // Print Yard without mower
    yard.printYard();
    System.out.println();

    // Get starting area
    System.out.print("Enter a starting row in your yard between 0 and " + (height - 1) + ": ");
    int mrow = in.nextInt();


    System.out.print("Enter a starting column in your yard between 0 and " + (width - 1) + ": ");
    int mcolumn = in.nextInt();

    //Get start direction
    System.out.print("Enter a starting direction for your mower. 0 is up, 1 is right, 2 is down, 3 is left: ");
    int mdirection = in.nextInt();

    //Print mower in yard
    Mower mower = new Mower(mrow, mcolumn, mdirection);
    clearScreen();
    yard.printYard(mower);

    while (true) {
        mower.cutGrass(yard);
                if (mower.checkGrass(yard) == false) {
                    // check right
                    mower.turnRight();
                    if (mower.checkGrass(yard) == true) {
                        mower.moveForward();
                    } else {
                        mower.turnLeft();
                        mower.turnLeft();
                        if (mower.checkGrass(yard) == true) {
                            mower.moveForward();
                        } else {
                            break;
                        }

                    }
                } else {
                    mower.moveForward();
                }
                clearScreen();

                
                yard.printYard(mower);

                System.out.println();
                delay(400);
            }
        }
    }





