//Michael Grunbeck
 import java.util.ArrayList;
 import java.util.Scanner;
 
 public class Project2 {
     public static void main(String[] args) {
         Scanner a = new Scanner(System.in);
 
         // Create array and fill it
         ArrayList<Integer> numbers = new ArrayList<>();
 
         while (true) {
             System.out.print("Enter integer values (use 'q' to quit):");
             if (a.hasNext("q") || a.hasNext("Q")) {
                 a.next();
                 break;
             } else { 
                 numbers.add(a.nextInt());
             }
         }
 
         int sum = 0;
         for (int i = 0; i < numbers.size(); i++) {
             if (i % 2 == 0) {
                 sum += numbers.get(i);
             } else {
                 sum -= numbers.get(i);
             }
             }
             System.out.println("Sum = " + sum);
 
     }
 }
