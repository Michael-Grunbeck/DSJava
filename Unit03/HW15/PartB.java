//Michael Grunbeck

import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws Exception {
        Scanner a = new Scanner(System.in);
        int max = 20;

        int[] values = new int[max];

        int size = 0;

        while (size < max) {
            System.out.print("Enter an integer value or press 'q' to quit (You can only enter 20 integer values): ");
            if (a.hasNext("q") || a.hasNext("Q")) {
                a.next();
                break;    
            } else {
                values[size] = a.nextInt();
                size++;
            }
        }

        System.out.print("Values entered: ");
        for (int i = 0; i < size; i++) {
            System.out.print(values[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.print("Enter a target integer value: ");
        int tarvalue = a.nextInt();

        int numtarget = 0;
        for (int i = 0; i < size; i++) {
            if (values[i] == tarvalue) {
                numtarget++;
            }
        }

        System.out.printf("The target value %d occurs %d times in your data set.%n", tarvalue, numtarget);
    }
}
