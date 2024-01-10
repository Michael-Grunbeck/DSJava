//Michael Grunbeck
 import java.util.Scanner;
 import java.util.Arrays;
 
 
 public class PartA {
     public static void main(String[] args) throws Exception {
         final int SIZE = 10;
         int[] values = new int[SIZE];
 
         int numofvalue = 0;
 
         Scanner input = new Scanner(System.in);
 
         boolean looper = true;
         while (looper) {
             System.out.print("Enter an integer or press 'q' to quit: ");
 
             if (input.hasNext("q") || input.hasNext("Q")) {
                 looper = false;
             } else {
                 if (numofvalue < values.length) {
                     values[numofvalue] = input.nextInt();
                     numofvalue = numofvalue + 1;
                 } else {
                     System.out.println("There's no more space. Can't input more integers.");
                     looper = false;
                 }
         }
     }
 
     System.out.print("*");
         for (int i = 0; i < numofvalue; i++) {
             System.out.print(values[i] + "*");
         }
         System.out.println();
 
        Arrays.sort(values, 0, numofvalue);
         for (int i = 0; i < numofvalue / 2; i++) {
             int reverse = values[i];
             values[i] = values[numofvalue - 1 - i];
             values[numofvalue - 1 - i] = reverse;
         }
 
         for (int i = 0; i < numofvalue; i++) {
             if (i == numofvalue - 1) {
                 System.out.println(values[i]);
             } else {
                 System.out.print(values[i] + ",");
             }
         }
     }
 }